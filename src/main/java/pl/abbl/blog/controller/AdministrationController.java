package pl.abbl.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.abbl.blog.model.BlogPost;
import pl.abbl.blog.service.BlogContentService;

@Controller
@RequestMapping("admin")
public class AdministrationController {
	@Autowired
	private BlogContentService blogContentService;
	
	@RequestMapping("/")
	public String getPanelOverview(Model model) {
		model.addAttribute("blogPosts", blogContentService.getAllPosts());
		return "admin";
	}
	
	@RequestMapping(value = "/content/post/add")
	public String createPost() {
		return "createpost";
	}
	
	@RequestMapping(value = "/content/post/add", method = RequestMethod.POST)
	public String addPost(@ModelAttribute("addPost") BlogPost blogPost) {
		blogContentService.addBlogPost(blogPost);
		System.out.println("Title:" + blogPost.getPostTitle() + " Content: " + blogPost.getPostContent() + " Category:" + blogPost.getPostCategory());
		return "redirect:/admin/";
	}
	
	@RequestMapping("/content/post/remove/{postId}")
	public String removePost(@PathVariable("postId") int postId) {
		blogContentService.removeBlogPost(postId);
		return "redirect:/admin/";
	}
}
