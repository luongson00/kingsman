package com.example.kingsman.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CTSP")
public class ChiTietSanPham {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCTSP;

    //Sản phẩm

    @ManyToOne
    @JoinColumn(name = "MAUSAC_ID")
    private MauSac mauSac;

    @ManyToOne
    @JoinColumn(name = "SIZE_ID")
    private Size size;

    @Column(name = "TEN")
    private String ten;

    @Column(name = "NGAYTAO")
    private Date ngayTao;

    @Column(name = "NGAYCAPNHAT")
    private Date ngayCapNhat;

    @Column(name = "TRANGTHAI")
    private Integer trangThai;
}
