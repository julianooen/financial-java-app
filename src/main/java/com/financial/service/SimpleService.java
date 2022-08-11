package com.financial.service;

import com.financial.entitites.Loan;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    Loan loan = new Loan();

    public SimpleService() {
    }

    public String setLoan(Double k,Double i, Integer t) {
        loan.setCapital(k);
        loan.setTax(i);
        loan.setTimeMonths(t);

        loan.setInterest(k*t*(i/100));
        loan.setTotalAmount(loan.getInterest()+k);

        return loan.toString();

    }

    public Loan getLoan() {
        return loan;
    }
}
