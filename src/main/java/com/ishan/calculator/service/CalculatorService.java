package com.ishan.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int getAddResult(int a, int b){
        return a + b;
    }
    public int getSubResult(int a, int b) {
        return a - b;
    }
}
