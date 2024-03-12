package com.example.kingsman.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GIOHANGCT")
public class GioHangChiTiet {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGioHangCT;

    @ManyToOne
    @JoinColumn(name = "GIOHANG_ID")
    private GioHang gioHang;

    @ManyToOne
    @JoinColumn(name = "CTSP_ID")
    private ChiTietSanPham chiTietSP;

    @Column(name = "GIA")
    private BigDecimal gia;

    @Column(name = "SOLUONG")
    private Integer soLuong;

    @Column(name = "NGAYTAO")
    private Date ngayTao;

    @Column(name = "NGAYCAPNHAT")
    private Date ngayCapNhat;

    @Column(name = "TRANGTHAI")
    private Integer trangThai;
}
