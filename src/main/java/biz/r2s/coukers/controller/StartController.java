package biz.r2s.coukers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/start")
public class StartController {
	
	@RequestMapping(value="/home")
	public String index() {
		return "start/home";
	}
	@RequestMapping(value="/new")
	public String novo() {
		return "start/new";
	}
	@RequestMapping(value="/login")
	public String login() {
		return "start/login";
	}
	@RequestMapping(value="/logout")
	public String logout() {
		return "start/logout";
	}

}
