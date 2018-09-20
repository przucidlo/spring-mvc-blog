package pl.abbl.blog.service;

import java.util.List;

import pl.abbl.blog.model.BlogPost;

public interface BlogContentService {
	BlogPost getPostById(int id);
	List<BlogPost> getAllPosts();
	List<BlogPost> getLatestPostByRange(int range);
	void addBlogPost(BlogPost blogPost);
	void editBlogPost(BlogPost blogPost);
	void removeBlogPost(int id);
}
