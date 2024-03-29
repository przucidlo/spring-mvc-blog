package pl.abbl.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.abbl.blog.service.BlogContentService;

@Controller
@RequestMapping("content")
public class BlogContentController {
	@Autowired
	private BlogContentService blogPostsService;
	
	@RequestMapping()
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/post/{postId}")
	public String getPostById(Model model, @PathVariable("postId") int postId) {
		model.addAttribute("blogPost", blogPostsService.getPostById(postId));
		return "post";
	}
}
