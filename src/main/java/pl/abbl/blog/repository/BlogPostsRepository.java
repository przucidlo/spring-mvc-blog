package pl.abbl.blog.repository;

import java.util.List;

import pl.abbl.blog.domain.BlogPost;

public interface BlogPostsRepository {
	BlogPost getPostById(String id);
	List<BlogPost> getLatestPostsByRange(int range);
	List<BlogPost> getAllPosts();
	List<BlogPost> getPostsByCategory(String category);
	List<BlogPost> getPostsByTags(List<String> tags);
	
	void addPost(BlogPost blogPost);
	void removePost(String id);
}
