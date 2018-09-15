package pl.abbl.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.abbl.blog.model.BlogPost;
import pl.abbl.blog.repository.BlogPostsRepository;
import pl.abbl.blog.service.BlogPostsService;

@Service
public class BlogPostServiceImpl implements BlogPostsService{
	@Autowired
	private BlogPostsRepository blogPostsRepository;

	@Override
	public BlogPost getPostById(int id) {
		return blogPostsRepository.getPostById(id);
	}

	@Override
	public List<BlogPost> getLatestPostByRange(int range) {
		return blogPostsRepository.getLatestPostsByRange(range);
	}
}
