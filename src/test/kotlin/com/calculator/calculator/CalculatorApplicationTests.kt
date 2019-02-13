package com.calculator.calculator

import io.restassured.RestAssured
import io.restassured.RestAssured.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.junit.Before
import org.springframework.boot.web.server.LocalServerPort


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalculatorApplicationTests {

    @LocalServerPort
    var port: Int = 0

    @Before
    fun setRestAssuredPort() {
        RestAssured.port = port
    }

    @Test
    fun contextLoads() {
        get("/calculatorview")
                .then()
                .assertThat().statusCode(200)
    }

}

