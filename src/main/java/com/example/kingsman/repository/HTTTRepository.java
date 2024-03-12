package com.example.kingsman.repository;

import com.example.kingsman.entities.HTTT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HTTTRepository extends JpaRepository<HTTT, Integer> {
}
