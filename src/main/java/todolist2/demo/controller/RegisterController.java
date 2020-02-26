package todolist2.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import todolist2.demo.model.User;
import todolist2.demo.service.UserService;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @GetMapping("register")
    public String registerHandler(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("do_register")
    public String doRegisterHandler(@ModelAttribute(name = "user") User user){
        userService.saveUser(user);
        return"redirect: /taskpage";
    }
}
