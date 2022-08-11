package com.financial.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleServiceTest {

    SimpleService simpleService = new SimpleService();

    @Test
    void shouldCalculateTotalAmount() {
        simpleService.setLoan(1000.0, 5.0, 10);
        Assertions.assertEquals(1500, simpleService.getLoan().getTotalAmount());
    }

    @Test
    void shouldCalculateInterest() {
        simpleService.setLoan(1000.0, 5.0, 10);
        Assertions.assertEquals(500, simpleService.getLoan().getInterest());
    }
}
