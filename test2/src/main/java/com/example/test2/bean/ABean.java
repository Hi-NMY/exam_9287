package com.example.test2.bean;

import java.util.List;

/**
 * @author nmy
 * @title: ABean
 * @date 2023/9/12 12:18
 */
public class ABean {
    private int year;
    private List<BBean> riskTop;

    public ABean() {
    }

    public ABean(int year, List<BBean> riskTop) {
        this.year = year;
        this.riskTop = riskTop;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<BBean> getRiskTop() {
        return riskTop;
    }

    public void setRiskTop(List<BBean> riskTop) {
        this.riskTop = riskTop;
    }
}
