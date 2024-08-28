package com.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.post.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
