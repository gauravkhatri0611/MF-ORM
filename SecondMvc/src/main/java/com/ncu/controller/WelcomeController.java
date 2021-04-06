package com.ncu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller 
public class WelcomeController {
	
		@RequestMapping("/hello")
		public String hellomsg (Model model) {
			return "index" ;
		}
		@RequestMapping("/login")
		public String doLogin(HttpServletRequest request, Model model) {
			String userId=request.getParameter("userId");
			model.addAttribute("msg", "login"+userId);
			return "end";
		}
		//@RequestMapping("/end")
		//public String doend(HttpServletRequest request, Model model) {
			//String userId=request.getParameter("userId");
			//model.addAttribute("msg1", "login"+userId);
		//	return "end";
	//	}

}
