package com.example.kingsman.controller;

import com.example.kingsman.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hoa-don-cho")
public class HoaDonChoController {
    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping("/hien-thi")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(hoaDonService.getAll());
    }

}
