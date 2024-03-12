package com.example.kingsman.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HTTT")
public class HTTT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer idHTTT;

    @ManyToOne
    @JoinColumn(name = "HOADON_ID")
    HoaDon hoaDon;

    @Column(name = "TEN")
    private String tenHTTT;

    @Column(name = "SOTIEN")
    private BigDecimal soTien;

    @Column(name = "MOTA")
    private String moTa;

    @Column(name = "TRANGTHAI")
    private Integer trangThai;

}


