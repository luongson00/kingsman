package com.example.kingsman.repository;

import com.example.kingsman.entities.HoaDonCho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoaDonChoRepository extends JpaRepository<HoaDonCho, Integer> {
}
