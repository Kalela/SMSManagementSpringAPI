package com.andela.SMSManagementSpringAPI.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class UserController(val userRepository: UserRepository) {

    @GetMapping
    fun getSomething() : String = "Look at me"

}