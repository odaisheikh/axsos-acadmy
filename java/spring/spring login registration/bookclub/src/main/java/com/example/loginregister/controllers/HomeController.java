package com.example.loginregister.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.loginregister.models.Book;
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
		 model.addAttribute("allbooks", userservice.allBooks());
		 return "index.jsp";
		 
	 }
	 
	 return "redirect:/";
 }
 @GetMapping("/logout")
 public String logout(Model model,HttpSession session) {
	 session.invalidate();
	 
	 return "redirect:/";
 }
 
 @GetMapping("/allbook")
 public String allbook(Model model,HttpSession session) {
	 if(session.getAttribute("user-id")==null)
		 return "redirect:/";
	 User x = userservice.findUser((long)session.getAttribute("user-id"));
	 model.addAttribute("user", x);
	 return "index.jsp";
 }
 
 @GetMapping("/book")
 public String getbook(Model model,HttpSession session,@ModelAttribute("addbook")Book book) {
	 User x = userservice.findUser((long)session.getAttribute("user-id"));
	 model.addAttribute("user", x);
	 model.addAttribute("allbooks", userservice.allBooks());
	 System.out.println(book);
	 return "addbook.jsp";
 }
 
 @PostMapping("/addbook")
 public String addbook(Model model,HttpSession session,@Valid@ModelAttribute("addbook")Book book ,BindingResult result) {
	 if(session.getAttribute("user-id")==null)
		 return "redirect:/";
	 
	 if(result.hasErrors()) {
 		return "addbook.jsp";
 	}
	
	 userservice.createBook(book);
	 userservice.addBookToUser((long)session.getAttribute("user-id"), book);
	 return "redirect:/allbook";
 }
 @GetMapping("/book/{id}")
 public String infobook(@PathVariable("id") Long id , Model model) {
	 System.out.println(id);
	 Book x = userservice.findBook(id);
	 model.addAttribute("book", x);
	 return "infobook.jsp";
	 
 }
 
}

