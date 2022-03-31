package com.github.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.blog.entity.Post;

public interface JwtRepository extends JpaRepository<Post, String> {

}
