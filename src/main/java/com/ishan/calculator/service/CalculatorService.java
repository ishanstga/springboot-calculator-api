package com.ishan.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double getAddResult(double a, double b){
        return a + b;
    }
    public double getSubResult(double a, double b) {
        return a - b;
    }
    public double getMulResult(double a, double b) { return a * b; }
    public double getDivResult(double a, double b) { return a / b; }
}
