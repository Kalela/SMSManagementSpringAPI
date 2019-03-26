package com.andela.SMSManagementSpringAPI.util.message

import com.andela.SMSManagementSpringAPI.util.message.models.Message
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository: CrudRepository<Message, Long> {
}