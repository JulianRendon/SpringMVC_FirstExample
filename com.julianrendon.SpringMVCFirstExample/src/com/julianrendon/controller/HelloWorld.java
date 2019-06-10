package com.julianrendon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String messsage = "<br><div style='text-align:center;'>"
				+ "<h3>*********** Hello World, Spring MVC First Example</h3>This message is coming from HelloWorld.java *********** </div><br><br>";
		return new ModelAndView("welcome", "message", messsage);
	}
}
