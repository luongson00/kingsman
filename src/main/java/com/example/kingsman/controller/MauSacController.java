package com.example.kingsman.controller;

import com.example.kingsman.entities.MauSac;
import com.example.kingsman.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mau-sac")
public class MauSacController {
    @Autowired
    private MauSacService mauSacService;

    @GetMapping("/hien-thi")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(mauSacService.getAll());
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody MauSac mauSac) {
        return ResponseEntity.ok(mauSacService.add(mauSac));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody MauSac mauSac) {
        return ResponseEntity.ok(mauSacService.update(mauSac, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        return ResponseEntity.ok(mauSacService.detele(id));
    }
}
