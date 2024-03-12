package com.example.kingsman.service;

import com.example.kingsman.entities.HoaDon;
import com.example.kingsman.repository.HoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonService {
    @Autowired
    private HoaDonRepository hoaDonRepo;

    public List<HoaDon> getAll() {
        return hoaDonRepo.findAll();
    }

    public HoaDon add(HoaDon hoaDon) {
        return hoaDonRepo.save(hoaDon);
    }

}
