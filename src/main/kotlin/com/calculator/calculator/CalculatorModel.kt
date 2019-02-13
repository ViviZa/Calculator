package com.calculator.calculator

class CalculatorModel {

    fun add(x: Int, y: Int): Int {
        System.out.println(x+y)
        return x + y
    }

    fun subtract(x: Int, y: Int): Int {
        System.out.println(x-y)
        return x - y
    }

    fun multiply(x : Int, y: Int) : Int {
        System.out.println(x*y)
        return x * y
    }

    fun divide(x : Int, y: Int) : Int {
        System.out.println(x/y)
        return x / y
    }
}
