package com.example.kingsman.service;

import com.example.kingsman.entities.ChiTietSanPham;
import com.example.kingsman.repository.ChiTietSanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietSanPhamService {
    @Autowired
    private ChiTietSanPhamRepository chiTietSanPhamRepo;

    public List<ChiTietSanPham> getAll() {
        return chiTietSanPhamRepo.findAll();
    }

    public ChiTietSanPham add(ChiTietSanPham chiTietSanPham) {
        return chiTietSanPhamRepo.save(chiTietSanPham);
    }
}
