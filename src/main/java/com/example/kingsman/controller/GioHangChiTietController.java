package com.example.kingsman.controller;

import com.example.kingsman.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gio-hang-chi-tiet")
public class GioHangChiTietController {

    @Autowired
    private GioHangService gioHangService;

    @GetMapping("/hien-thi")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(gioHangService.getAll());
    }
}
