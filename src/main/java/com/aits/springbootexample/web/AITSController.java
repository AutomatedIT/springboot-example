package com.aits.springbootexample.web;

import com.aits.springbootexample.Note;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AITSController {

    @RequestMapping(value = "/application")
    public String about(){ return "application"; }

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }


    @GetMapping("/note")
    public String noteForm(Model model) {
        model.addAttribute("note", new Note("note2", "note2 context"));
        return "note";
    }

    @PostMapping("/note")
    public String noteSubmit(@ModelAttribute Note note) {
        return "result";
    }
}
