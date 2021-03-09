package com.example.model

import play.api.libs.json.Json

import scala.beans.BeanProperty

class UserResponse(@BeanProperty name: String, @BeanProperty address: String) {

  override def toString: String =
    Json.prettyPrint(Json.parse(
      s"""
        {
          "name": "$name",
          "address": "$address"
        }
        """.stripMargin))
}
