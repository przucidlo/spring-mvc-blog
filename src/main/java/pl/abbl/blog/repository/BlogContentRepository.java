package pl.abbl.blog.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import pl.abbl.blog.model.BlogPost;

@Repository
public interface BlogContentRepository {
	BlogPost getPostById(int id);
	List<BlogPost> getAllPosts();
	List<BlogPost> getLatestPostsByRange(int range);
	List<BlogPost> getPostsByCategory(String category);
	List<BlogPost> getPostsByTags(List<String> tags);
	void addPost(BlogPost blogPost);
	void editPost(BlogPost blogPost);
	void removePost(int id);
}
