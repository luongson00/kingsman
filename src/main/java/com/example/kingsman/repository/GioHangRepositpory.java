package com.example.kingsman.repository;

import com.example.kingsman.entities.GioHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GioHangRepositpory extends JpaRepository<GioHang, Integer> {
}
