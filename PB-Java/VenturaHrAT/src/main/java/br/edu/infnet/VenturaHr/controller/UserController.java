package br.edu.infnet.VenturaHr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.VenturaHr.model.User;
import br.edu.infnet.VenturaHr.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/user")
	public String registerScreen() {
		return "user/register";
	}

	@GetMapping(value = "/users")
	public String listScreen(Model model) {

		model.addAttribute("usersList", userService.getList());
		
		return "user/list";
	}

	@PostMapping(value = "/user/add")
	public String include(User user) {
		
		userService.add(user);
		
		return "redirect:/";
	}

}