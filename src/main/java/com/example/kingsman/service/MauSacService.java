package com.example.kingsman.service;

import com.example.kingsman.entities.MauSac;
import com.example.kingsman.repository.MauSacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MauSacService {
    @Autowired
    private MauSacRepository mauSacRepo;

    public List<MauSac> getAll() {
        return mauSacRepo.findAll();
    }

    public MauSac add(MauSac mauSac) {
        return mauSacRepo.save(mauSac);
    }

    public MauSac update(MauSac mauSac, Integer id) {
        Optional<MauSac> mauSacOptional = mauSacRepo.findById(id);
        return mauSacOptional.map(mauSac1 -> {
            mauSac1.setTenMauSac(mauSac.getTenMauSac());
            mauSac1.setNgayTao(mauSac.getNgayTao());
            mauSac1.setNgayCapNhat(mauSac.getNgayCapNhat());
            mauSac1.setTrangThai(mauSac.getTrangThai());
            return mauSacRepo.save(mauSac1);
        }).orElse(null);
    }

    public MauSac detele(Integer id) {
        Optional<MauSac> mauSacOptional = mauSacRepo.findById(id);
        return mauSacOptional.map(mauSac -> {
            mauSacRepo.delete(mauSac);
            return mauSac;
        }).orElse(null);
    }
}
