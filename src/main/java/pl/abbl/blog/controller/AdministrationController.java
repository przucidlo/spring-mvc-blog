package pl.abbl.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdministrationController {
	@RequestMapping()
	public String getPanelOverview() {
		return "index";
	}
}
