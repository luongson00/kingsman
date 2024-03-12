package com.example.kingsman.service;

import com.example.kingsman.entities.HoaDonCho;
import com.example.kingsman.repository.HoaDonChoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonChoService {
    @Autowired
    HoaDonChoRepository hoaDonChoRepo;

    public List<HoaDonCho> getAll() {
        return hoaDonChoRepo.findAll();
    }

    public HoaDonCho add(HoaDonCho hoaDonCho) {
        return hoaDonChoRepo.save(hoaDonCho);
    }

}
