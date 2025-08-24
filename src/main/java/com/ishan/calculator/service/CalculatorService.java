package com.ishan.calculator.service;

import com.ishan.calculator.model.Operation;
import com.ishan.calculator.model.Result;
import com.ishan.calculator.repository.OperationRepository;
import com.ishan.calculator.repository.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CalculatorService {
    private final OperationRepository operationRepository;
    private final ResultRepository resultRepository;

    public CalculatorService(OperationRepository operationRepository, ResultRepository resultRepository) {
        this.operationRepository = operationRepository;
        this.resultRepository = resultRepository;
    }

    public Result getAddResult(Operation op){
        operationRepository.save(op);
        double opResult;
        switch (op.getOperation()) {
            case "+" -> opResult = op.getValueOne() + op.getValueTwo();
            case "-" -> opResult = op.getValueOne() - op.getValueTwo();
            case "*" -> opResult = op.getValueOne() * op.getValueTwo();
            case "/" -> opResult = op.getValueOne() / op.getValueTwo();
            default -> opResult = 0;
        }
        Result result = new Result(op.getId(), op.getValueOne(), op.getValueTwo(), op.getOperation(), opResult);
        resultRepository.save(result);
        return result;
    }

    public ArrayList<Result> getHistory() {
        return new ArrayList<Result>(resultRepository.findAll());
    }
}
