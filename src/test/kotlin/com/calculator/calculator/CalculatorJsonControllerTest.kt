package com.calculator.calculator

import org.hamcrest.CoreMatchers
import org.junit.Assert.assertThat
import org.junit.Test
import org.mockito.InjectMocks

class CalculatorJsonControllerTest {
    @InjectMocks
    val calculator = CalculatorJsonController()

    @Test
    fun addsTwoNumbers(){
        val result = calculator.add(mapOf("x" to 1, "y" to 2))
        assertThat(result.getValue("result"), CoreMatchers.`is`(3))
    }

    @Test
    fun subtractsTwoNumbers(){
        val result = calculator.subtract(mapOf("x" to 6, "y" to 2))
        assertThat(result.getValue("result"), CoreMatchers.`is`(4))
    }

    @Test
    fun multipliesTwoNumbers(){
        val result = calculator.multiply(mapOf("x" to 6, "y" to 2))
        assertThat(result.getValue("result"), CoreMatchers.`is`(12))
    }
    @Test
    fun dividesTwoNumbers(){
        val result = calculator.divide(mapOf("x" to 6, "y" to 2))
        assertThat(result.getValue("result"), CoreMatchers.`is`(3))
    }

}