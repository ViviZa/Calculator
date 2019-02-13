package com.calculator.calculator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class CalController {

    private val calculatorModel = CalculatorModel()

    @RequestMapping("/calculatorview")
    fun getCalculator(): ModelAndView {
        val mav = ModelAndView("calculatorview")
        mav.addObject("addNumbers", calculatorModel.add(2, 3))
        mav.addObject("subtractNumbers", calculatorModel.subtract(2, 3))
        mav.addObject("multiplyNumbers", calculatorModel.multiply(2, 3))
        mav.addObject("divideNumbers", calculatorModel.divide(2, 3))
        return mav
    }
}