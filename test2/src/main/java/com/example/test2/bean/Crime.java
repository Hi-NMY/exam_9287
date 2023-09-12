package com.example.test2.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author nmy
 * @title: Crime
 * @date 2023/9/12 11:58
 */
public class Crime implements Serializable{

    private Integer incidentId;
    private Integer offenceCode;
    private LocalDateTime dispatchTime;
    private Integer victims;
    private String crimeName1;
    private String crimeName2;
    private String crimeName3;
    private String city;
    private LocalDateTime startDateTime;

    public Integer getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Integer incidentId) {
        this.incidentId = incidentId;
    }

    public Integer getOffenceCode() {
        return offenceCode;
    }

    public void setOffenceCode(Integer offenceCode) {
        this.offenceCode = offenceCode;
    }

    public LocalDateTime getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(LocalDateTime dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Integer getVictims() {
        return victims;
    }

    public void setVictims(Integer victims) {
        this.victims = victims;
    }

    public String getCrimeName1() {
        return crimeName1;
    }

    public void setCrimeName1(String crimeName1) {
        this.crimeName1 = crimeName1;
    }

    public String getCrimeName2() {
        return crimeName2;
    }

    public void setCrimeName2(String crimeName2) {
        this.crimeName2 = crimeName2;
    }

    public String getCrimeName3() {
        return crimeName3;
    }

    public void setCrimeName3(String crimeName3) {
        this.crimeName3 = crimeName3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Crime() {
    }
}
