package com.calculator.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CalculatorServiceTest {

    private val calculator = CalculatorService()

    @Test
    fun calculatorAdds2Numbers() {
        val result = calculator.add(10, 2)
        assertThat(result).isEqualTo(12)
    }

    @Test
    fun calculatorSubtracts2Numbers() {
        val result = calculator.subtract(20, 10)
        assertThat(result).isEqualTo(10)
    }

    @Test
    fun calculatorMultiplies2Numbers(){
        val result = calculator.multiply(45, 2)
        assertThat(result).isEqualTo(90)
    }

    @Test
    fun calculatorDivides2Numbers(){
        val result = calculator.divide(40, 4)
        assertThat(result).isEqualTo(10)
    }
}