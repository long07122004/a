package com.example.sd18307.controller;

import com.example.sd18307.entity.SinhVien;
import com.example.sd18307.service.SinhVienService;
import com.example.sd18307.service.impl.SinhVienServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    SinhVienService sinhVienService = new SinhVienServiceImpl();

    @RequestMapping("/home")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String viewLogin() {
        return "index";
    }

    @PostMapping("/login")
    public String login(
//            HttpServletRequest request
            @RequestParam("username") String username,
            @RequestParam("password") String password
    ) {
//        String username = request.getParameter("username");
        if (username.equals("admin") && password.equals("admin")) {
            // trả vè trang login thanh cong
            return "login-thanh-cong";
        }
        return "index";
    }

    // tao sinh vien có id, hoten, dia chi. gioi tính


}
