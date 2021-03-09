package com.example.controllers

import com.example.model.{CreateUserRequest, UserResponse}
import com.example.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.{HttpHeaders, HttpStatus, ResponseEntity}
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation._

import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping(path = Array("/api"))
class HomeController @Autowired()(private val userService: UserService) {

  @GetMapping(path = Array("/"))
  def test: ResponseEntity[String] = {
    new ResponseEntity("Test", new HttpHeaders, HttpStatus.OK)
  }

  @GetMapping(path = Array("/users"))
  def get_users(response: HttpServletResponse): Unit = {
    val users = userService.getAllUsers
    response.getWriter.print(users)
    respond(response, HttpStatus.OK)
  }

  private def respond(response: HttpServletResponse): Unit = {
    response.setStatus(HttpStatus.OK.value())
    response.getWriter.flush()
    response.getWriter.close()
  }
}
