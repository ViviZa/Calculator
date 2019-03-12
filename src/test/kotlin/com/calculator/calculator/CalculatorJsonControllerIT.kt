package com.calculator.calculator

import io.restassured.RestAssured
import io.restassured.http.ContentType
import org.hamcrest.CoreMatchers.`is`
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalculatorJsonControllerIT {

    @LocalServerPort
    var port: Int = 0

    @Before
    fun setRestAssuredPort() {
        RestAssured.port = port
    }

    @Test
    fun addValues() {
        RestAssured
                .given()
                .`when`()
                .contentType(ContentType.JSON)
                .body("{\"x\":2,\"y\":2}")
                .post("/add")
                .then()
                .assertThat().statusCode(200)
                .body("second", `is`(4))
    }

    @Test
    fun subtractValues() {
        RestAssured
                .given()
                .`when`()
                .contentType(ContentType.JSON)
                .body("{\"x\":5,\"y\":2}")
                .post("/subtract")
                .then()
                .assertThat().statusCode(200)
                .body("second", `is`(3))
    }

    @Test
    fun multiplyValues() {
        RestAssured
                .given()
                .`when`()
                .contentType(ContentType.JSON)
                .body("{\"x\":2,\"y\":4}")
                .post("/multiply")
                .then()
                .assertThat().statusCode(200)
                .body("second", `is`(8))
    }

    @Test
    fun divideValues() {
        RestAssured.given()
                .`when`()
                .contentType(ContentType.JSON)
                .body("{\"x\":10,\"y\":5}")
                .post("/divide")
                .then()
                .assertThat().statusCode(200)
                .body("second", `is`(2))
    }
}
