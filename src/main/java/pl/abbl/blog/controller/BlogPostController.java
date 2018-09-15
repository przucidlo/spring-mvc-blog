package pl.abbl.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.abbl.blog.service.BlogPostsService;

@Controller
@RequestMapping("content")
public class BlogPostController {
	@Autowired
	private BlogPostsService blogPostsService;
	
	@RequestMapping("/post/{postId}")
	public String getPostById(Model model, @PathVariable("postId") int postId) {
		model.addAttribute("blogPost", blogPostsService.getPostById(postId));
		return "post";
	}
}
