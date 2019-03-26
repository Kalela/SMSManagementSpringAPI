package com.andela.SMSManagementSpringAPI.user

import com.andela.SMSManagementSpringAPI.util.message.models.Message
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(val recieverName: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

    fun getMessage(message: Message) {

    }
}