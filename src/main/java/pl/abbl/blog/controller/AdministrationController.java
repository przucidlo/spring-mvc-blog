package pl.abbl.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.abbl.blog.model.BlogPost;
import pl.abbl.blog.service.BlogContentService;

@Controller
@RequestMapping("admin")
public class AdministrationController {
	@Autowired
	private BlogContentService blogContentService;
	
	@RequestMapping()
	public String getPanelOverview() {
		return "index";
	}
	
	@RequestMapping("/content/post/add")
	@ResponseBody
	public void addPost(@ModelAttribute("addPost") BlogPost blogPost) {
		
	}
	
	@RequestMapping("/content/post/remove")
	public void removePost() {
		
	}
}
