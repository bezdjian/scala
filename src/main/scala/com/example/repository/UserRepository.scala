package com.example.repository

import com.example.entity.User
import org.springframework.data.jpa.repository.JpaRepository

trait UserRepository extends JpaRepository[User, Long] {}
