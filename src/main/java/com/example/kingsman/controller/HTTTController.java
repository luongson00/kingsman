package com.example.kingsman.controller;

import com.example.kingsman.service.HTTTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hinh-thuc-thanh-toan")
public class HTTTController {
    @Autowired
    private HTTTService htttService;

    @GetMapping("/hien-thi")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(htttService.getAll());
    }
}
