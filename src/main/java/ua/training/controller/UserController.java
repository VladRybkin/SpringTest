package ua.training.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ua.training.model.User;
import ua.training.service.UserService;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;


@Controller
@SessionAttributes("name")
@RequestMapping("/users")

public class UserController {

    @Autowired
    UserService userService;
    Logger log = Logger.getLogger(UserController.class.getName());


    @GetMapping
    public String findAll(Model model, HttpSession session, HttpServletRequest request) {
        ModelAndView modelAndView=new ModelAndView("users");

        model.addAttribute("name", "hellosession");
        model.addAttribute("userlast", userService.getUsers());
        return "users";
    }


   @PostMapping
    public RedirectView submit(@ModelAttribute("user") User user) {

        if (user != null) {
            user.setRole(User.Role.ADMIN);
            userService.addUser(user);
            log.info("submit method runned");

        }
        return new RedirectView("users");
    }


}
