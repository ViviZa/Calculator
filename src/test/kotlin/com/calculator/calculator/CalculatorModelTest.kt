package com.calculator.calculator

import org.junit.Assert.*
import org.hamcrest.CoreMatchers.*
import org.junit.Test

class CalculatorModelTest {

    @Test
    fun calculatorAdds2Numbers() {
        val calculatorModel = CalculatorModel()
        val result = calculatorModel.add(10, 2)
        assertThat(result, `is`(12))
    }

}