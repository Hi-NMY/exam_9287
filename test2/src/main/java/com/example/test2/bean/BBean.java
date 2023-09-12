package com.example.test2.bean;

/**
 * @author nmy
 * @title: BBean
 * @date 2023/9/12 12:41
 */
public class BBean {
    private String city;
    private double riskIndex;
    private Integer rank;

    public BBean() {
    }

    public BBean(String city, double riskIndex, Integer rank) {
        this.city = city;
        this.riskIndex = riskIndex;
        this.rank = rank;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getRiskIndex() {
        return riskIndex;
    }

    public void setRiskIndex(double riskIndex) {
        this.riskIndex = riskIndex;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
