package com.ishan.calculator.controller;

import com.ishan.calculator.model.Operation;
import com.ishan.calculator.model.Result;
import com.ishan.calculator.service.CalculatorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/calculator")
@Validated
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("calculate")
    public Result add(@RequestBody Operation op){ return calculatorService.getAddResult(op); }

}
