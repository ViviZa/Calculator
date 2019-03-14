package com.calculator.calculator

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorJsonController {

    private val calculatorService = CalculatorService()

    @PostMapping(value = ["/add"])
    fun add(@RequestBody map : Map<String, Int>): Map<String, Int> {
        val result = calculatorService.add(map.getOrDefault("x", 0), map.getOrDefault("y", 0))
        return hashMapOf("result" to result)
    }

    @PostMapping(value = ["/subtract"])
    fun subtract(@RequestBody map : Map<String, Int>): Map<String, Int> {
        val result = calculatorService.subtract(map.getOrDefault("x", 0), map.getOrDefault("y", 0))
        return hashMapOf("result" to result)
    }

    @PostMapping(value = ["/multiply"])
    fun multiply(@RequestBody map : Map<String, Int>): Map<String, Int> {
        val result = calculatorService.multiply(map.getOrDefault("x", 0), map.getOrDefault("y", 0))
        return hashMapOf("result" to result)
    }

    @PostMapping(value = ["/divide"])
    fun divide(@RequestBody map : Map<String, Int>): Map<String, Int> {
        val result = calculatorService.divide(map.getOrDefault("x", 0), map.getOrDefault("y", 0))
        return hashMapOf("result" to result)
    }
}