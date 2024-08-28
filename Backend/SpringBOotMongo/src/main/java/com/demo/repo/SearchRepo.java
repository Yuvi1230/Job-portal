package com.demo.repo;

import java.util.List;

import com.demo.post.Post;

public interface SearchRepo {
	List<Post> findByText(String text);
	

}
