package com.example.kingsman.service;

import com.example.kingsman.entities.HoaDonChiTiet;
import com.example.kingsman.repository.HoaDonChiTietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonChiTietService {
    @Autowired
    private HoaDonChiTietRepository hoaDonChiTietRepo;

    public List<HoaDonChiTiet> getAll() {
        return hoaDonChiTietRepo.findAll();
    }

    public HoaDonChiTiet add(HoaDonChiTiet hoaDonChiTiet) {
        return hoaDonChiTietRepo.save(hoaDonChiTiet);
    }

}
