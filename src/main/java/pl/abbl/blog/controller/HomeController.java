package pl.abbl.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.abbl.blog.service.BlogPostsService;

@Controller
public class HomeController {
	private final static int LATEST_POST_RANGE = 5;
	
	@Autowired
	BlogPostsService blogPostsService;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("blogPosts", blogPostsService.getLatestPostByRange(LATEST_POST_RANGE));
		
		return "index";
	}
}
