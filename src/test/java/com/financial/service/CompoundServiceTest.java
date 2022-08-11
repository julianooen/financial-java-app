package com.financial.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class CompoundServiceTest {

    @Autowired
    CompoundService compoundService = new CompoundService();

    @Test
    void shouldCalculateTotalAmount() {
        compoundService.setLoan(1000.0, 5.0, 10);
        Assertions.assertEquals(1628.894626777442, compoundService.getLoan().getTotalAmount());
    }

    @Test
    void shouldCalculateInterest() {
        compoundService.setLoan(1000.0, 5.0, 10);
        Assertions.assertEquals(628.894626777442, compoundService.getLoan().getInterest());
    }
}