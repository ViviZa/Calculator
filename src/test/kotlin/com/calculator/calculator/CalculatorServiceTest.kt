package com.calculator.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CalculatorServiceTest {

    private val calculator = CalculatorService()
    private var calculatorModel = CalculatorModel()

    @Test
    fun calculatorAdds2Numbers() {
        calculatorModel.x = 10
        calculatorModel.y = 2
        val result = calculator.add(calculatorModel)
        assertThat(result).isEqualTo(12)
    }

    @Test
    fun calculatorSubtracts2Numbers() {
        calculatorModel.x = 20
        calculatorModel.y = 10
        val result = calculator.subtract(calculatorModel)
        assertThat(result).isEqualTo(10)
    }

    @Test
    fun calculatorMultiplies2Numbers() {
        calculatorModel.x = 45
        calculatorModel.y = 2
        val result = calculator.multiply(calculatorModel)
        assertThat(result).isEqualTo(90)
    }

    @Test
    fun calculatorDivides2Numbers() {
        calculatorModel.x = 40
        calculatorModel.y = 4
        val result = calculator.divide(calculatorModel)
        assertThat(result).isEqualTo(10)
    }
}