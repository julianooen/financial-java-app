package com.financial.entitites;

public class Loan {
    private Double tax;
    private Double capital;
    private Integer timeMonths;
    private Double totalAmount;
    private  Double interest;

    public Loan() {
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Integer getTimeMonths() {
        return timeMonths;
    }

    public void setTimeMonths(Integer timeMonths) {
        this.timeMonths = timeMonths;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "tax=" + tax +
                ", capital=" + capital +
                ", timeMonths=" + timeMonths +
                ", totalAmount=" + totalAmount +
                ", interest=" + interest +
                '}';
    }
}
