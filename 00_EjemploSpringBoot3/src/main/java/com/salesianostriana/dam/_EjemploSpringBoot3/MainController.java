package com.salesianostriana.dam._EjemploSpringBoot3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/admin")
public class MainController {

    @GetMapping("/index/")
    public String index(Model model){
        model.addAttribute( "mensaje", "Hola a todos coders de 2ºDAM");
        return "index";
    }
}
