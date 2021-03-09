package com.example.entity

import java.beans.BeanProperty
import javax.persistence._

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

  def this(name: String, address: String) {
    this()
    this.name = name
    this.address = address
  }
}
