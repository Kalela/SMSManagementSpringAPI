package com.andela.SMSManagementSpringAPI.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api/v1")
class UserController {

    @Autowired
    lateinit var userRepository: UserRepository

    @GetMapping
    fun getSomething() : String = "Look at me"

    @PostMapping("/sendmessage")
    fun sendMessage(): String {
//        userRepository.findById(1)
        return "Message sent"
    }

    @PostMapping("/auth/register")
    @ResponseStatus(HttpStatus.CREATED)
    fun registerUser(@Valid @RequestBody user : User ): String {
        try {
            userRepository.save(user)
        } catch (e : Exception) {
            return "Something went wrong"
        }

        println(user.username + user.id)
        return "User registered successfully"
    }

}