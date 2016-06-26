package biz.r2s.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/")
	public String index() {
		return "redirect:start/home";
	}

}
