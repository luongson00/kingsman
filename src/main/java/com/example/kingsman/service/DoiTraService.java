package com.example.kingsman.service;

import com.example.kingsman.entities.DoiTra;
import com.example.kingsman.repository.DoiTraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoiTraService {
    @Autowired
    private DoiTraRepository doiTraRepo;

    public List<DoiTra> getAll() {
        return doiTraRepo.findAll();
    }

    public DoiTra add(DoiTra doiTra) {
        return doiTraRepo.save(doiTra);
    }
}
