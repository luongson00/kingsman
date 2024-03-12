package com.example.kingsman.repository;

import com.example.kingsman.entities.DoiTra;
import com.example.kingsman.entities.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {
}
