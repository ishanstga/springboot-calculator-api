package com.ishan.calculator;

import com.ishan.calculator.controller.CalculatorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		//CalculatorController calculatorController = new CalculatorController();

	}

}
