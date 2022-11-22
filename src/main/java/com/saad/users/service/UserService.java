package com.saad.users.service;

import com.saad.users.entities.Role;
import com.saad.users.entities.User;

public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
}