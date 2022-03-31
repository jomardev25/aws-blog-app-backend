package com.github.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {

//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		List<Role> roles = roleRepository.findAll();
//
//		User user = new User();
//		user.getRoles().addAll(roles);
//		user.setEmail("jane@gmail.com");
//		user.setUsername("jane");
//		user.setFirstName("jane");
//		user.setLastName("jane");
//		user.setPassword(passwordEncoder.encode("admin"));
//
//		userRepository.save(user);

		return "Home";
	}

	@GetMapping("/api")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok("Hello");
	}

}
