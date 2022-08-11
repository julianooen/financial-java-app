package com.financial.controller;

import com.financial.service.CompoundService;
import com.financial.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/calc")
public class Controller {

    @Autowired
    private CompoundService compoundService;

    @Autowired
    private SimpleService simpleService;

    @GetMapping("compost")
    public String compostCalc(@RequestParam(value = "capital", required = true) Double k,
                              @RequestParam(value = "time", required = true) Integer t,
                              @RequestParam(value = "tax", required = true) Double i) {
        try {
            return compoundService.setLoan(k, i, t);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error: invalid parameters!");
        }
    }

    @GetMapping("simple")
    public String simpleCalc(@RequestParam(value = "capital", required = true) Double k,
                             @RequestParam(value = "time", required = true) Integer t,
                             @RequestParam(value = "tax", required = true) Double i) {
        try {
            return simpleService.setLoan(k, i, t);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error: invalid parameters!");
        }
    }
}
