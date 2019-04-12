package com.obsydian.web.locksite.forum.mapper;

import com.obsydian.web.locksite.forum.domain.user.User;
import com.obsydian.web.locksite.forum.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

	public User mapToUser(final UserDTO userDTO){
		return new User(userDTO.getId(), userDTO.getName(), userDTO.getRegistrationDate());
	}

	public UserDTO mapToUserDTO(final User user){
		return new UserDTO(user.getId(), user.getName(), user.getRegistrationDate());
	}

	public List<User> mapToUserList(final List<UserDTO> userDTOList){
		return userDTOList.stream()
				.map(u -> new User(u.getId(), u.getName(), u.getRegistrationDate()))
				.collect(Collectors.toList());
	}

	public List<UserDTO> matToUserDTOList(final List<User> userList){
		return userList.stream()
				.map(u -> new UserDTO(u.getId(), u.getName(), u.getRegistrationDate()))
				.collect(Collectors.toList());
	}
}
