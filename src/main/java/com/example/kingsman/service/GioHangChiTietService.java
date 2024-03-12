package com.example.kingsman.service;

import com.example.kingsman.entities.GioHangChiTiet;
import com.example.kingsman.repository.GioHangChiTietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangChiTietService {
    @Autowired
    private GioHangChiTietRepository gioHangChiTietRepo;

    public List<GioHangChiTiet> getAll() {
        return gioHangChiTietRepo.findAll();
    }

    public GioHangChiTiet add(GioHangChiTiet gioHangChiTiet) {
        return gioHangChiTietRepo.save(gioHangChiTiet);
    }
}
