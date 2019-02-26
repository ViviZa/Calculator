package com.calculator.calculator

import io.restassured.RestAssured
import io.restassured.RestAssured.*
import io.restassured.http.ContentType
import org.hamcrest.CoreMatchers
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

    @Test
    fun postValues() {
        RestAssured
                .given()
                .`when`()
                .contentType(ContentType.URLENC)
                .body("x=2&y=2&action=add")
                .post("/calculation")
                .then()
                .assertThat().statusCode(200)
                .body(CoreMatchers.containsString("4"))
    }

    @Test
    fun divideByZero() {
        given()
                .`when`()
                .contentType(ContentType.URLENC)
                .body("x=0&y=0&action=divide")
                .post("/calculation")
                .then()
                .assertThat().statusCode(200)
                .body(CoreMatchers.containsString("Calculator"))
    }
}

