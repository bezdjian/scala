package com.example

import com.example.entity.User
import com.example.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class AppSetup @Autowired() (userRepository: UserRepository){

  @Bean
  def setupUsers(): Unit = {
    val user: User = new User()
    user.name = "Harout"
    user.address = "Huddinge"

    val user1: User = new User()
    user1.name = "Test"
    user1.address = "Test"
    userRepository.save(user)
    userRepository.save(user1)
  }
}
