package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application

object ScalaApplication {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Application])
  }
}