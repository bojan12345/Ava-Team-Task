package com.ava.service;

import com.ava.dto.SearchRecord;
import com.ava.model.*;
import com.ava.model.enumeration.Role;
import com.ava.dto.CreateUserRequest;
import com.ava.dto.UpdateCurrentUserRequest;
import com.ava.dto.UpdateUserRequest;

import java.util.List;


public interface UserService {

	User updateCurrentUser(UpdateCurrentUserRequest request);

	User updateUser(Long id, UpdateUserRequest user);

	User saveUser(CreateUserRequest user, Role role);

	User findCurrentUser();

	User findUserById(Long id);

	List<User> findUsers(String role, SearchRecord searchRecord);

	String getCurrentUserEmail();
}
