package com.nano

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated

@Controller("/calculator")
@Validated
class MathController {

    @Get("/greeting")
    fun greeting(): HttpResponse<String> {
        return HttpResponse.ok("Hello, Micronaut!")
    }

    @Post("/add", produces = [MediaType.APPLICATION_JSON])
    fun add(): HttpResponse<String> {
        val num1 = 5
        val num2 = 3
        val result = num1 + num2
        return HttpResponse.ok("Result of addition: $result")
    }

    @Post("/subtract", produces = [MediaType.APPLICATION_JSON])
    fun subtract(): HttpResponse<String> {
        val num1 = 10
        val num2 = 3
        val result = num1 - num2
        return HttpResponse.ok("Result of subtraction: $result")
    }
}
