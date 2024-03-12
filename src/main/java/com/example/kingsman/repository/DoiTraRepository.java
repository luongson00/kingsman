package com.example.kingsman.repository;

import com.example.kingsman.entities.DoiTra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoiTraRepository extends JpaRepository<DoiTra, Integer> {
}
