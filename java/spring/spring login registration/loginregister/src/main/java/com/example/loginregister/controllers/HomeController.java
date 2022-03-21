package com.example.loginregister.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.loginregister.models.LoginUser;
import com.example.loginregister.models.User;
import com.example.loginregister.services.UserService;

//.. don't forget to inlcude all your imports! ..

@Controller
public class HomeController {
	private final UserService  userservice;
	
 
 public HomeController(UserService userservice) {
		this.userservice = userservice;
	}

// Add once service is implemented:
 // @Autowired
 // private UserService userServ;
 
 @GetMapping("/")
 public String index(Model model) {
	 System.out.println("**");
     // Bind empty User and LoginUser objects to the JSP
     // to capture the form input
     model.addAttribute("newUser", new User());
     model.addAttribute("newLogin", new LoginUser());
     System.out.println("99");
     return "form.jsp";
 }
 
 @PostMapping("/register")
 public String register(@Valid @ModelAttribute("newUser") User newUser, 
         BindingResult result, Model model, HttpSession session) {
	     User x =userservice.register(newUser, result);
         
     
     if(result.hasErrors()) {
         // Be sure to send in the empty LoginUser before 
         // re-rendering the page.
         model.addAttribute("newLogin", new LoginUser());
         return "form.jsp";
     }
     
     
     session.setAttribute("user-id", x.getId());
     
     return "redirect:/home";
 }
 
 @PostMapping("/login")
 public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
         BindingResult result, Model model, HttpSession session) {
     
     // Add once service is implemented:
      User user = userservice.login(newLogin, result);
 
     if(result.hasErrors()) {
         model.addAttribute("newUser", new User());
         return "form.jsp";
     }
 
     session.setAttribute("user-id", user.getId()); 
     // TO-DO Later: Store their ID from the DB in session, 
     // in other words, log them in.
 
     return "redirect:/home";
 }
 @GetMapping("/home")
 public String home(Model model,HttpSession session) {
	 if(session.getAttribute("user-id")==null)
		 return "redirect:/";
	 User x = userservice.findUser((long)session.getAttribute("user-id"));
	 if ((long)session.getAttribute("user-id")==x.getId()) {
		 model.addAttribute("user",x);
		 return "index.jsp";
		 
	 }
	 
	 return "redirect:/";
 }
 @GetMapping("/logout")
 public String logout(Model model,HttpSession session) {
	 session.invalidate();
	 
	 return "redirect:/";
 }
 
 
}
