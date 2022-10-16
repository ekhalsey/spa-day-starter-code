package org.launchcode.spaday.controllers;

import org.launchcode.spaday.data.UserData;
import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("user")
public class UserController {
    private static boolean errorMessage = false;
    @GetMapping("add")
    public String addUserForm(Model model) {
            return "user/add";
    }

    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {

        if(user.getPassword().equals(verify)) {
            user.setDate(LocalDate.now());
            UserData.addUser(user);
            model.addAttribute("users", UserData.getAll());
            return "user/index";
        }
        String error = "Passwords did not match. Please try again.";
        model.addAttribute("error", error);
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());
        return "user/add";
    }
    @GetMapping("{userId}")
    public String displayUserInformation(Model model, @PathVariable int userId) {
        model.addAttribute("user", UserData.getById(userId));
        return "user/userDetail";
    }
}
