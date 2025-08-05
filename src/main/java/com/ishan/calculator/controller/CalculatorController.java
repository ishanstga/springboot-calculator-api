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
    public int add(@RequestParam int a, @RequestParam int b){
        return calculatorService.getAddResult(a, b);
    }
    @GetMapping("sub")
    public int sub(@RequestParam int a, @RequestParam int b){
        return calculatorService.getSubResult(a, b);
    }
}
