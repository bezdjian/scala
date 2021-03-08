package com.example.entity

import lombok.{Builder, Data}

import java.beans.BeanProperty
import javax.persistence._

@Data
@Builder
@Entity
class User {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
  @SequenceGenerator(name = "USER_SEQ", sequenceName = "USER_SEQ", allocationSize = 1)
  var Id: Long = _
  @BeanProperty
  var name: String = _
  @BeanProperty
  var address: String = _
}
