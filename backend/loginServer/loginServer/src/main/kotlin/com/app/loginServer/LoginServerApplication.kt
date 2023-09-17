package com.app.loginServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoginServerApplication

fun main(args: Array<String>) {
	runApplication<LoginServerApplication>(*args)
}
