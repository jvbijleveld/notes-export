package nl.vanbijleveld.notesexport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsiteController {

    @RequestMapping(value = "/csrf")
    public String infoPage(Model model) {
        return "csrf";
    }

    
    @RequestMapping(value = "/")
    public String registerPage(Model model) {
        model.addAttribute("title", "Notes Export");
        return "frameset";
    }

}