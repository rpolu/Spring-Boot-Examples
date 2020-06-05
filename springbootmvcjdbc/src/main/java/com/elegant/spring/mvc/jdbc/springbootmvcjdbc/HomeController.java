package com.elegant.spring.mvc.jdbc.springbootmvcjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.elegant.spring.mvc.model.UserModel;
import com.elegant.spring.mvc.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public ModelAndView openHomePage() {
		ModelAndView modelAndView = new ModelAndView("home");
		List<UserModel> users = userService.getUsers();
		modelAndView.addObject("urs", users);
		return modelAndView;
	}

	@GetMapping("/newUser")
	public ModelAndView newUser() {
		ModelAndView modelAndView = new ModelAndView("newuser");
		modelAndView.addObject("userForm", new UserModel());
		return modelAndView;
	}

}
