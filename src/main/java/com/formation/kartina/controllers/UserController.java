package com.formation.kartina.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.formation.kartina.entities.UserEntity;



@Controller
public class UserController {
    
    @GetMapping("/inscription")
    public String inscription(Model model) {
        model.addAttribute("user", new UserEntity());
        return "user/inscription.html";
    }
}
