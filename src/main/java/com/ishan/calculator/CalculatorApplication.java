package com.ishan.calculator;

import com.ishan.calculator.controller.CalculatorController;
import com.ishan.calculator.model.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.NativeDetector;
import org.springframework.web.servlet.function.ServerResponse;

import javax.naming.Context;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		//CalculatorController calculatorController = new CalculatorController();

	}

}
