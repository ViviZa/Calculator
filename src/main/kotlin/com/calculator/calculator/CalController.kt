package com.calculator.calculator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class CalController {

    private val calculatorService = CalculatorService()

    @RequestMapping("/calculatorview")
    fun getCalculator(): ModelAndView {
        val calculatorModel = CalculatorModel();
        val mav = ModelAndView("calculatorview")
        mav.addObject("calculator", calculatorModel)
        return mav
    }
}