package com.calculator.calculator

import org.junit.Assert.*
import org.junit.Test
import org.mockito.InjectMocks
import org.hamcrest.CoreMatchers.*
import org.springframework.web.servlet.ModelAndView

class CalControllerTest {

@InjectMocks
val calController = CalController()

    @Test
    fun calculatorTemplateIsShown(){
        val mav : ModelAndView = calController.getCalculator()
        assertThat(mav.viewName, `is`("calculatorview"))
    }

    @Test
    fun addedTemplateIsShown(){
    }
}