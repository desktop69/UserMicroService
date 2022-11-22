package com.saad.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.saad.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
