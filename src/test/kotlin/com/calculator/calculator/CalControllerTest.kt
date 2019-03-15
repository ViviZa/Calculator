package com.calculator.calculator

import org.hamcrest.CoreMatchers
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
        //given
        val model = CalculatorModel()
        model.x = 12
        model.y = 3
        val resultMav : ModelAndView = calController.add(model)
        val result : Int? = resultMav.modelMap["result"] as Int?
        assertThat(result, CoreMatchers.notNullValue())
        assertThat(result,`is`(15))
//        val expectedMav = ModelAndView("calculatorview")
//        expectedMav.addObject("calculator", model)
//        expectedMav.addObject("result", 15)
//
//        assertThat(resultMav, CoreMatchers.equalTo(expectedMav))
    }
}