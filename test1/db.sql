DELETE FROM crime_data 
WHERE (incident_id, start_date_time) NOT IN (
    SELECT incident_id, max_start_date_time
    FROM (
        SELECT incident_id, MAX(start_date_time) as max_start_date_time
        FROM crime_data 
        GROUP BY incident_id
    ) AS subquery
) OR (start_date_time, offence_code) NOT IN (
    SELECT start_date_time, max_offence_code
    FROM (
        SELECT start_date_time, MAX(offence_code) as max_offence_code
        FROM crime_data 
        GROUP BY start_date_time
    ) AS subquery
);

UPDATE crime_data 
SET dispatch_time = start_date_time 
WHERE dispatch_time IS NULL;

DELETE FROM crime_data 
WHERE 
    incident_id IS NULL OR 
    start_date_time IS NULL OR 
    offence_code IS NULL OR 
    dispatch_time IS NULL OR
		victims IS NULL OR
		crime_name1 IS NULL OR
		crime_name2 IS NULL OR
		crime_name3 IS NULL OR
		city IS NULL;
		
DELETE FROM crime_data 
WHERE start_date_time < '2021-01-01';

UPDATE crime_data 
SET city = UPPER(city);

CREATE TABLE crimes (
    incident_id INT PRIMARY KEY,
    offence_code INT,
		dispatch_time DATETIME,
		victims INT,
    city VARCHAR(255),
    start_date_time DATETIME
);

CREATE TABLE offences (
    offence_code INT PRIMARY KEY,
    crime_name1 VARCHAR(255),
		crime_name2 VARCHAR(255),
		crime_name3 VARCHAR(255)
);

INSERT INTO crimes (incident_id, offence_code, dispatch_time, victims, city,start_date_time)
SELECT incident_id, COALESCE(offence_code, 0), COALESCE(dispatch_time, '1900-01-01'), COALESCE(victims, 0),COALESCE(city, ''), COALESCE(start_date_time, '1900-01-01')
FROM crime_data;


INSERT INTO offences (offence_code, crime_name1, crime_name2, crime_name3)
SELECT DISTINCT offence_code, COALESCE(crime_name1, ''),  COALESCE(crime_name2, ''),  COALESCE(crime_name3, '')
FROM crime_data;

