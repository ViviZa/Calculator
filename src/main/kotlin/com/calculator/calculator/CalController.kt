package com.calculator.calculator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class CalController {

    @GetMapping("/myCalculator")
    fun getCalculator(): ModelAndView {
        return ModelAndView("CalculatorView")
    }
}