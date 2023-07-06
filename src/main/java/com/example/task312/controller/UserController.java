package com.example.task312.controller;

import com.example.task312.model.User;
import com.example.task312.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("userList", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user_add";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable("id") Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user_edit";
    }

    @PatchMapping("/edit/{id}")
    public String editUser(@PathVariable("id") Long id, @ModelAttribute("user") User user) {
        user.setId(id);
        userService.updateUser(user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
