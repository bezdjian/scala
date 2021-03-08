package com.example.service

import com.example.entity.User
import com.example.repository.UserRepository
import org.mockito.Mockito.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec
import java.util

class UserServiceTest extends AnyFlatSpec {

  val userRepository: UserRepository = mock(classOf[UserRepository])

  "Get all users" should "return list of users" in {
    val userService = new UserService(userRepository)
    when(userRepository.findAll()).thenReturn(mockUsersList)
    assert(userService.getAllUsers.size() > 0)
  }

  private def mockUsersList: util.List[User] = {
    val list = new util.ArrayList[User]()
    list.add(new User())
    list
  }
}