package com.calculator.calculator

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class ViewController {

    @RequestMapping(value = ["/"])
    fun index() : String{
        return "index"
    }
}