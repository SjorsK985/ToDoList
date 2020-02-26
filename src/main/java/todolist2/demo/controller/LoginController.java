package todolist2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import todolist2.demo.model.User;

@Controller
public class LoginController {

    @GetMapping("login")
    public String loginHandler(){
        
        return "login";
    }

    @PostMapping("do_login")
    public String loginHandler(@RequestParam(name="email") String email,
                               @RequestParam(name="password") String password){

        return "redirect: /taskpage";
    }
}
