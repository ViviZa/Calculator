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
        val calculatorModel = CalculatorModel()
        val mav = ModelAndView("calculatorview")
        mav.addObject("calculator", calculatorModel)
        return mav
    }

    @RequestMapping(value = ["/calculation"], method = [RequestMethod.POST], params = ["action=add"])
    fun add(@ModelAttribute calculator: CalculatorModel): ModelAndView {
        val result = calculatorService.add(calculator)
        val mav = ModelAndView("calculatorview")
        mav.addObject("calculator", calculator)
        mav.addObject("result", result)
        return mav
    }

    @RequestMapping(value = ["/calculation"], method = [RequestMethod.POST], params = ["action=subtract"])
    fun subtract(@ModelAttribute calculator: CalculatorModel): ModelAndView {
        val result = calculatorService.subtract(calculator)
        val mav = ModelAndView("calculatorview")
        mav.addObject("calculator", calculator)
        mav.addObject("result", result)
        return mav
    }

    @RequestMapping(value = ["/calculation"], method = [RequestMethod.POST], params = ["action=multiply"])
    fun multiply(@ModelAttribute calculator: CalculatorModel): ModelAndView {
        val result = calculatorService.multiply(calculator)
        val mav = ModelAndView("calculatorview")
        mav.addObject("calculator", calculator)
        mav.addObject("result", result)
        return mav
    }

    @RequestMapping(value = ["/calculation"], method = [RequestMethod.POST], params = ["action=divide"])
    fun divide(@ModelAttribute calculator: CalculatorModel): ModelAndView {
        if (calculator.y == 0) {
            return ModelAndView("errorTemplate")
        }
        val result = calculatorService.divide(calculator)
        val mav = ModelAndView("calculatorview")
        mav.addObject("calculator", calculator)
        mav.addObject( "result", result)
        return mav
    }
}