package com.mk.bigBank.model;

public class LoanRequest {

    private String income;
    private String currenciesNumber;
    private String fIS;
    private String tHI;
    private String sEC;

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getCurrenciesNumber() {
        return currenciesNumber;
    }

    public void setCurrenciesNumber(String currenciesNumber) {
        this.currenciesNumber = currenciesNumber;
    }

    public String getfIS() {
        return fIS;
    }

    public void setfIS(String fIS) {
        this.fIS = fIS;
    }

    public String gettHI() {
        return tHI;
    }

    public void settHI(String tHI) {
        this.tHI = tHI;
    }

    public String getsEC() {
        return sEC;
    }

    public void setsEC(String sEC) {
        this.sEC = sEC;
    }
}
