package com.example.controllers

import com.example.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, ResponseBody, RestController}

import javax.servlet.http.HttpServletResponse

@RequestMapping(path = Array("/users"))
@RestController
class HomeController @Autowired()(private val userService: UserService) {

  @GetMapping(path = Array("/res"))
  @ResponseBody
  def users(response: HttpServletResponse): Unit = {
    response.getWriter.println("Dummy response")
    respond(response)
  }

  @GetMapping
  @ResponseBody
  def get_users(response: HttpServletResponse): Unit = {
    response.getWriter.println(userService.getAllUsers)
    respond(response)
  }

  private def respond(response: HttpServletResponse): Unit = {
    response.setStatus(HttpStatus.OK.value())
    response.getWriter.flush()
    response.getWriter.close()
  }
}
