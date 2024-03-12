package com.example.kingsman.controller;

import com.example.kingsman.service.DoiTraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doi-tra")
public class DoiTraController {
    @Autowired
    private DoiTraService doiTraService;

    @GetMapping("/hien-thi")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(doiTraService.getAll());
    }

}
