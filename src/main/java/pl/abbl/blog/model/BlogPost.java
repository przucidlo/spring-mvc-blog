package pl.abbl.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "blogposts")
public class BlogPost {
	@Id
	@Column(name = "post_Id", nullable = false)
	private int postId;
	@Column(name = "post_Title", nullable = false)
	private String postTitle;
	@Column(name = "post_Content", nullable = false)
	private String postContent;
	@Column(name = "post_Category", nullable = false)
	private String postCategory;
	
	public BlogPost(int postId, String postTitle, String postContent, String postCategory) {
		this.postId = postId;
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.postCategory = postCategory;
	}
	
	public BlogPost() {
		
	}
	
	public int getPostId() {
		return postId;
	}
	
	public String getPostTitle() {
		return postTitle;
	}
	
	public String getPostContent() {
		return postContent;
	}
	
	public String getPostCategory() {
		return postCategory;
	}
	
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	
	public void setPostCategory(String postCategory) {
		this.postCategory = postCategory;
	}
}
