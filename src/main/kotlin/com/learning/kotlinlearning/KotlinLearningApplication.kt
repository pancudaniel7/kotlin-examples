package com.learning.kotlinlearning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinLearningApplication

fun main(args: Array<String>) {
	runApplication<KotlinLearningApplication>(*args)
}

@RestController
class TestRemoteDebugController {

	@GetMapping("/test")
	fun ping(): String {
		return "ping!"
	}
}
