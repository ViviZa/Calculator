package com.calculator.calculator

import org.junit.Assert.*
import org.hamcrest.CoreMatchers.*
import org.junit.Test

class CalculatorModelTest {

    private val calculatorModel = CalculatorModel()

    @Test
    fun calculatorAdds2Numbers() {
        val result = calculatorModel.add(10, 2)
        assertThat(result, `is`(12))
    }

    @Test
    fun calculatorSubtracts2Numbers() {
        val result = calculatorModel.subtract(20, 10)
        assertThat(result, `is`(10))
    }

    @Test
    fun calculatorMultiplies2Numbers(){
        val result = calculatorModel.multiply(45, 2)
        assertThat(result, `is`(70))
    }

    @Test
    fun calculatorDivides2Numbers(){
        val result = calculatorModel.divide(40, 4)
        assertThat(result, `is`(10))
    }
}