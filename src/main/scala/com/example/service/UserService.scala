package com.example.service

import com.example.entity.User
import com.example.model.{CreateUserRequest, UserResponse}
import com.example.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import java.util
import java.util.stream.Collectors

@Service
class UserService @Autowired()(private val userRepository: UserRepository) {

  def getAllUsers: util.List[UserResponse] = {
    val users = userRepository.findAll()

    users.stream()
      .map(user => new UserResponse(user.name, user.address))
      .collect(Collectors.toList[UserResponse])
  }

  def createUser(createRequest: CreateUserRequest): UserResponse = {
    val user = new User(createRequest.name, createRequest.address)
    userRepository.save(user)
    new UserResponse(user.name, user.address)
  }
}