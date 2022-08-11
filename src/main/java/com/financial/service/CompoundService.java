package com.financial.service;

import com.financial.entitites.Loan;
import org.springframework.stereotype.Service;

@Service
public class CompoundService {

    Loan loan = new Loan();

    public CompoundService() {
    }

    public String setLoan(Double k, Double i, Integer t) {
        loan.setCapital(k);
        loan.setTax(i);
        loan.setTimeMonths(t);

        loan.setTotalAmount(k * (Math.pow(1 + (i / 100), t)));

        loan.setInterest(loan.getTotalAmount() - k);
        return loan.toString();

    }

    public Loan getLoan() {
        return loan;
    }
}
