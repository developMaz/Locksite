package com.obsydian.web.locksite.forum.controller;

import com.obsydian.web.locksite.forum.domain.forum.Category;
import com.obsydian.web.locksite.forum.domain.forum.Post;
import com.obsydian.web.locksite.forum.domain.user.User;
import com.obsydian.web.locksite.forum.dto.CategoryDTO;
import com.obsydian.web.locksite.forum.dto.PostDTO;
import com.obsydian.web.locksite.forum.dto.UserDTO;
import com.obsydian.web.locksite.forum.exceptions.CategoryNotFoundException;
import com.obsydian.web.locksite.forum.exceptions.PostNotFoundException;
import com.obsydian.web.locksite.forum.exceptions.UserNotFoundException;
import com.obsydian.web.locksite.forum.mapper.CategoryMapper;
import com.obsydian.web.locksite.forum.mapper.PostMapper;
import com.obsydian.web.locksite.forum.mapper.UserMapper;
import com.obsydian.web.locksite.forum.service.CategoryService;
import com.obsydian.web.locksite.forum.service.PostService;
import com.obsydian.web.locksite.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/api/forum")
public class ForumController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private PostService postService;

	@Autowired
	private UserService userService;

	@Autowired
	private CategoryMapper categoryMapper;

	@Autowired
	private PostMapper postMapper;

	@Autowired
	private UserMapper userMapper;

	//CATEGORY CRUD
	@RequestMapping(method = RequestMethod.POST, value = "saveCategory")
	public void saveCategory(@RequestBody CategoryDTO categoryDTO) {
		categoryService.save(categoryMapper.mapToCategory(categoryDTO));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "deleteCategory")
	public void deleteCategory(@RequestParam Integer id) throws CategoryNotFoundException {
		categoryService.delete(categoryService.findById(id).orElseThrow(CategoryNotFoundException::new));
	}

	@RequestMapping(method = RequestMethod.GET, value = "getCategory")
	public CategoryDTO getCategory(@RequestParam Integer id) throws CategoryNotFoundException {
		return categoryMapper.mapToCategoryDTO(categoryService.findById(id).orElseThrow(CategoryNotFoundException::new));
	}

	@RequestMapping(method = RequestMethod.GET, value = "getAllCategory")
	public List<CategoryDTO> getAllCategory() {
		return categoryMapper.mapToCategoryListDTO(categoryService.findAll());
	}

	//POST CRUD
	@RequestMapping(method = RequestMethod.POST, value = "savePost")
	public void savePost(@RequestBody PostDTO postDTO) {
		postService.save(postMapper.mapToPost(postDTO));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "deletePost")
	public void deletePost(@RequestParam Integer id) throws PostNotFoundException {
		postService.delete(postService.findById(id).orElseThrow(PostNotFoundException::new));
	}

	@RequestMapping(method = RequestMethod.GET, value = "getPost")
	public PostDTO getPost(@RequestParam Integer id) throws PostNotFoundException {
		return postMapper.mapToPostDTO(postService.findById(id).orElseThrow(PostNotFoundException::new));
	}

	@RequestMapping(method = RequestMethod.GET, value = "getAllPosts")
	public List<PostDTO> getAllPosts() {
		return postMapper.mapToPostListDTO(postService.findAll());
	}

	//USER CRUD
	@RequestMapping(method = RequestMethod.POST, value = "saveUser")
	public void saveUser(@RequestBody UserDTO userDTO) {
		userService.save(userMapper.mapToUser(userDTO));
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
	public void deleteUser(@RequestParam String name) throws UserNotFoundException {
		userService.delete(userService.findByName(name).orElseThrow(UserNotFoundException::new));
	}

	@RequestMapping(method = RequestMethod.GET, value = "getUser")
	public UserDTO getUser(@RequestParam String name) throws UserNotFoundException {
		return userMapper.mapToUserDTO(userService.findByName(name).orElseThrow(UserNotFoundException::new));
	}

	@RequestMapping(method = RequestMethod.GET, value = "getAllUsers")
	public List<UserDTO> getAllUser(){
		return userMapper.matToUserDTOList(userService.findAll());
	}






}
