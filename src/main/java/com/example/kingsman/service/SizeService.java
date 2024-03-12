package com.example.kingsman.service;

import com.example.kingsman.entities.Size;
import com.example.kingsman.repository.SizeRepository;
import com.example.kingsman.specification.SizeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SizeService {
    @Autowired
    private SizeRepository sizeRepo;

    public Page<Size> timKiemSize(String tenSize, Date ngayTao, Date ngayCapNhat, Integer trangThai, Pageable pageable) {
        Specification<Size> sizeSpecification = SizeSpecification.filterSize(tenSize, ngayTao, ngayCapNhat, trangThai);
        return sizeRepo.findAll(sizeSpecification, pageable);
    }

    public List<Size> getAll() {
        return sizeRepo.findAll();
    }

    public Size add(Size size) {
        return sizeRepo.save(size);
    }

    public Size update(Size size, Integer id) {
        Optional<Size> sizeOptional = sizeRepo.findById(id);
        return sizeOptional.map(size1 -> {
            size1.setTenSize(size.getTenSize());
            size1.setNgayTao(size.getNgayTao());
            size1.setNgayCapNhat(size.getNgayCapNhat());
            size1.setTrangThai(size.getTrangThai());
            return sizeRepo.save(size1);
        }).orElse(null);
    }

    public Size delete(Integer id) {
        Optional<Size> sizeOptional = sizeRepo.findById(id);
        return sizeOptional.map(size -> {
            sizeRepo.delete(size);
            return size;
        }).orElse(null);
    }
}
