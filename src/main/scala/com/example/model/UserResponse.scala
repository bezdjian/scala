package com.example.model

import lombok.{Builder, Value}
import play.api.libs.json.Json

@Value
@Builder
class UserResponse(name: String, address: String) {

  override def toString: String =
    Json.prettyPrint(Json.parse(
      s"""
        {
          "name": "$name",
          "address": "$address"
        }
        """.stripMargin))
}
