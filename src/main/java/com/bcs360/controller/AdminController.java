package com.bcs360.controller;

import com.bcs360.entity.Admin;
import com.bcs360.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/admin-login")
    public String login(@RequestBody Admin admin){

        Admin existing = adminRepository
                .findByUsernameAndPassword(admin.getUsername(), admin.getPassword());

        if(existing != null){
            return "success";
        } else {
            return "fail";
        }
    }
}