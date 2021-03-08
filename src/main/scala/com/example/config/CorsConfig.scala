package com.example.config

import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.web.servlet.config.annotation.{CorsRegistry, WebMvcConfigurer}

@Configuration
class CorsConfig {

  @Bean
  def corsConfiguration(): WebMvcConfigurer = {
    new WebMvcConfigurer() {
      override def addCorsMappings(registry: CorsRegistry): Unit =
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("*")
    }
  }
}
