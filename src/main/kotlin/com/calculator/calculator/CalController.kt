package com.calculator.calculator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
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

    @RequestMapping(value = ["/add"], method = [RequestMethod.POST])
    fun postCalculator(@ModelAttribute calculator: CalculatorModel) : ModelAndView {
        val result = calculatorService.add(calculator)
        val mav = ModelAndView("addedTemplate")
        mav.addObject("result", result)
        return mav
    }
}