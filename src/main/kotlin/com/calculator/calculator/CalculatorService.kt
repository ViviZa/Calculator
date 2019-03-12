package com.calculator.calculator

class CalculatorService {

    fun add(calculatorModel: CalculatorModel): Int {
        return calculatorModel.x + calculatorModel.y
    }

    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun subtract(calculatorModel: CalculatorModel): Int {
        return calculatorModel.x - calculatorModel.y
    }
    fun subtract(x: Int, y: Int): Int {
        return x - y
    }

    fun multiply(calculatorModel: CalculatorModel) : Int {
        return calculatorModel.x * calculatorModel.y
    }

    fun multiply(x: Int, y: Int): Int {
        return x * y
    }

    fun divide(calculatorModel: CalculatorModel) : Int {
        return calculatorModel.x / calculatorModel.y
    }

    fun divide(x: Int, y: Int): Int {
        return x / y
    }
}