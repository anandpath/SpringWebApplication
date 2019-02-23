package com.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class GreetingController {
	@GetMapping("/")
	public String greet() {
		return "greet";
	}

	@PostMapping("/greetNameForm")
	public String greetNameForm(@ModelAttribute Account account, Model model) {
		System.out.println("hello " + account.name);
		model.addAttribute("account", account);
		return "greetName";
	}

	@PostMapping("/greetName")
	public String greetName(@RequestBody Account account, Model model) {
		System.out.println("hello " + account.name);
		model.addAttribute("account", account);
		return "greetName";
	}
	
	@GetMapping("/a")
	public String a() {
		return "../a";
	}
}
