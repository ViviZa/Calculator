package com.calculator.calculator

class CalculatorService {

    fun add(calculatorModel: CalculatorModel): Int {
        return calculatorModel.x + calculatorModel.y
    }

    fun subtract(calculatorModel: CalculatorModel): Int {
        return calculatorModel.x - calculatorModel.y
    }

    fun multiply(calculatorModel: CalculatorModel) : Int {
        return calculatorModel.x * calculatorModel.y
    }

    fun divide(calculatorModel: CalculatorModel) : Int {
        return calculatorModel.x / calculatorModel.y
    }
}