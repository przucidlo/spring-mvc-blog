package pl.abbl.blog.service;

import java.util.List;

import pl.abbl.blog.model.BlogPost;

public interface BlogContentService {
	BlogPost getPostById(int id);
	List<BlogPost> getLatestPostByRange(int range);
	void addBlogPost(BlogPost blogPost);
}
