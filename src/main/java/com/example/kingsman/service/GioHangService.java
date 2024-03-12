package com.example.kingsman.service;

import com.example.kingsman.entities.GioHang;
import com.example.kingsman.repository.GioHangRepositpory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangService {
    @Autowired
    private GioHangRepositpory gioHangRepo;

    public List<GioHang> getAll() {
        return gioHangRepo.findAll();
    }

    public GioHang add(GioHang gioHang) {
        return gioHangRepo.save(gioHang);
    }
}
