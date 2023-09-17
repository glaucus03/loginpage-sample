package com.app.loginServer

import org.springframework.stereotype.Controller
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class LoginController {

  @GetMapping("/")
  fun root(): ResponseEntity<String> {
    return ResponseEntity("root", HttpStatus.OK)
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
