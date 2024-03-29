package org.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("cheese")
public class CheeseController {

    public static void main(String[] args) {
    }

    HashMap<String, String> cheeses = new HashMap<>();

    {
    }

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");

        return "cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {
        model.addAttribute("title", "Add Cheese");
        return "cheese/add";

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@RequestParam String cheeseName, @RequestParam String cheeseDescription) {

        cheeses.put(cheeseName, cheeseDescription);
        //rediret to cheese
        return "redirect:";
    }


    @RequestMapping (value = "delete", method = RequestMethod.GET)
    public  String RemoveCheeseController (Model model){
        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title","Remove Cheese");
        return "cheese/delete";
        }



    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String RemoveCheeseController(@RequestParam ArrayList<String> cheeseName) {
        for (String cheese  : cheeseName ){
            cheeses.remove(cheese);
        }
        return "redirect:";
        }

        }
