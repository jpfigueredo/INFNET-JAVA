package br.edu.infnet.VenturaHr.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.VenturaHr.model.User;
import br.edu.infnet.VenturaHr.service.UserService;

@SessionAttributes("user")
@Controller
public class AccessController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "/")
	public String homeScreen() {
		return "home";		
	}
	
	@GetMapping(value = "/login")
	public String loginScreen() {
		return "login";		
	}
	
	@GetMapping(value = "/logout")
	public String logout(SessionStatus status, HttpSession session) {
		
		status.setComplete();
		session.removeAttribute("user");
		
		return "redirect:/";		
	}
	@PostMapping(value = "/login")
	public String validate(Model model, @RequestParam String email, @RequestParam String password){
		
		User user = userService.authentication(email, password);

		if(user != null) {
			model.addAttribute("user", user);
			
			return "redirect:/";
		} else {
			model.addAttribute(
					"msg",
					"User "+ email +" credentials are incorrect."
				);

			return loginScreen();
		}	

	}
}
