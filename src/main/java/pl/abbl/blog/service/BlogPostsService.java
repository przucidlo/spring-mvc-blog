package pl.abbl.blog.service;

import java.util.List;

import pl.abbl.blog.model.BlogPost;

public interface BlogPostsService {
	BlogPost getPostById(int id);
	List<BlogPost> getLatestPostByRange(int range);
}
