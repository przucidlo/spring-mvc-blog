package pl.abbl.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.abbl.blog.model.BlogPost;
import pl.abbl.blog.repository.BlogContentRepository;
import pl.abbl.blog.service.BlogContentService;

@Service
public class BlogContentServiceImpl implements BlogContentService{
	@Autowired
	private BlogContentRepository blogPostsRepository;

	@Override
	public BlogPost getPostById(int id) {
		return blogPostsRepository.getPostById(id);
	}
	
	@Override
	public List<BlogPost> getAllPosts() {
		return blogPostsRepository.getAllPosts();
	}
	
	@Override
	public List<BlogPost> getLatestPostByRange(int range) {
		return blogPostsRepository.getLatestPostsByRange(range);
	}

	@Override
	public void addBlogPost(BlogPost blogPost) {
		blogPostsRepository.addPost(blogPost);
	}
	
	@Override
	public void editBlogPost(BlogPost blogPost) {
		blogPostsRepository.editPost(blogPost);	
	}
	
	@Override
	public void removeBlogPost(int id) {	
		blogPostsRepository.removePost(id);
	}
}
