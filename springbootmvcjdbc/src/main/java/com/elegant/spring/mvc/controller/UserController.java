package com.elegant.spring.mvc.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.elegant.spring.mvc.model.UserModel;
import com.elegant.spring.mvc.service.UserService;

@Controller
public class UserController {

	@Autowired

	private UserService userService;

	@PostMapping("/saveUser")
	public ModelAndView saveUser(UserModel userModel) {
		userService.saveUser(userModel);
		ModelAndView modelAndView = new ModelAndView("home");
		List<UserModel> users = userService.getUsers();
		modelAndView.addObject("urs", users);
		return modelAndView;
	}
	
	@GetMapping("/deleteUser/{phno}")
	public ModelAndView deleteUser(@PathVariable("phno") String phno ) {
		//Delete User
		userService.deleteUser(phno);
		ModelAndView modelAndView = new ModelAndView("home");
		List<UserModel> users = userService.getUsers();
		modelAndView.addObject("urs", users);
		return modelAndView;
	}
	

}
