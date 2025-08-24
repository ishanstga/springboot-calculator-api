package com.ishan.calculator.controller;

import com.ishan.calculator.model.Operation;
import com.ishan.calculator.model.Result;
import com.ishan.calculator.service.CalculatorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/calculator")
@Validated
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("calculate")
    public Result calculate(@RequestBody Operation op){ return calculatorService.getAddResult(op); }

    @GetMapping("history")
    public ArrayList<Result> history(){
        return calculatorService.getHistory();
    }

}
