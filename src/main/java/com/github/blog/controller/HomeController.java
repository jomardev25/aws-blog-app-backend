package com.github.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.blog.entity.Role;
import com.github.blog.entity.User;
import com.github.blog.repository.RoleRepository;
import com.github.blog.repository.UserRepository;

@RestController
public class HomeController {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/")
	public String home() {

		/*
		 * PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); List<Role>
		 * roles = roleRepository.findAll();
		 *
		 * User user = new User(); user.getRoles().addAll(roles);
		 * user.setEmail("admin@gmail.com"); user.setUsername("admin");
		 * user.setFirstName("admin"); user.setLastName("admin");
		 * user.setPassword(passwordEncoder.encode("admin"));
		 *
		 * userRepository.save(user);
		 */
		return "Home";
	}

	@GetMapping("/api")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok("Hello");
	}

}
