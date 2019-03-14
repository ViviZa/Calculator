package com.calculator.calculator

import io.restassured.RestAssured
import org.hamcrest.CoreMatchers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ViewControllerIT {
    @LocalServerPort
    var port: Int = 0

    @Before
    fun setRestAssuredPort() {
        RestAssured.port = port
    }

    @Test
    fun contextLoads() {
        RestAssured.get("/")
                .then()
                .assertThat().statusCode(200)
                .body(CoreMatchers.containsString("Calculator ReactJs"))
    }
}