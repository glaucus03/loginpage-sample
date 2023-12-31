package com.app.loginServer.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

  @GetMapping("/test")
  fun root(): ResponseEntity<String> {
    return ResponseEntity("test", HttpStatus.OK)
  }

  @GetMapping("/login")
  fun login(): ResponseEntity<String> {
    return ResponseEntity("login", HttpStatus.OK)
  }

  @GetMapping("/logout")
  fun logout(): ResponseEntity<String> {
    return ResponseEntity("logout", HttpStatus.OK)
  }
}
