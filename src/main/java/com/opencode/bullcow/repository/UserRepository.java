package com.opencode.bullcow.repository;

import com.opencode.bullcow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
