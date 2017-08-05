package me.elvira.demo.controllers;

import me.elvira.demo.Users;
import me.elvira.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController
{
    @Autowired //prevents requirement to reinstantiate in every method
    UserRepository userRepository;

    @GetMapping("/")
    public String index()
    {
        return "index";
    }
    @GetMapping("/getstarted")
    public String getStarted()
    {
        return "index";
    }
    @GetMapping("/adduser")
    public String addUser(Model model)
    {
        model.addAttribute("adduser", new Users());
        return "adduser";
    }

    @PostMapping("/adduser") //user add
    public String productSubmit(@ModelAttribute("adduser") Users user, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "adduser";
        }
        userRepository.save(user);
        return "showuser";
    }

    @GetMapping("/showallusers")
    public String showAllUsers(Model model)
    {
        Iterable <Users> userList = userRepository.findAll();
        model.addAttribute("userList", userList);
        return "showallusers";
    }
}