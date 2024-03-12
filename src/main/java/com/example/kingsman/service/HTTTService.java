package com.example.kingsman.service;

import com.example.kingsman.entities.HTTT;
import com.example.kingsman.repository.HTTTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HTTTService {
    @Autowired
    private HTTTRepository htttRepo;

    public List<HTTT> getAll() {
        return htttRepo.findAll();
    }

    public HTTT add(HTTT httt) {
        return htttRepo.save(httt);
    }
}
