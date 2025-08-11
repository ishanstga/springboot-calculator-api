package com.ishan.calculator.controller;

import com.ishan.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("add")
    public double add(@RequestParam double a, @RequestParam double b){
        return calculatorService.getAddResult(a, b);
    }
    @GetMapping("sub")
    public double sub(@RequestParam double a, @RequestParam double b){
        return calculatorService.getSubResult(a, b);
    }
    @GetMapping("mul")
    public double mul(@RequestParam double a, @RequestParam double b) { return calculatorService.getMulResult(a, b); }
    @GetMapping("div")
    public double div(@RequestParam double a, @RequestParam double b) { return calculatorService.getDivResult(a, b); }
}
