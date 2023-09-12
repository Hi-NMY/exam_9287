package com.example.test2.bean;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author nmy
 * @title: Offences
 * @date 2023/9/12 12:05
 */
public class Offences implements Serializable {

    private Integer offenceCode;
    private String crimeName1;
    private String crimeName2;
    private String crimeName3;

    public Offences() {
    }

    public Integer getOffenceCode() {
        return offenceCode;
    }

    public void setOffenceCode(Integer offenceCode) {
        this.offenceCode = offenceCode;
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
}
