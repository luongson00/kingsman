package com.example.kingsman.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "HOADON")
public class HoaDon {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHoaDon;

    @Column(name = "MA")
    private String maHoaDon;

    @Column(name = "KIEUHD")
    private Integer kieuHoaDon;

    @Column(name = "DIACHI")
    private String diaChi;

    @Column(name = "SDT")
    private String soDienThoai;

    @Column(name = "GHICHU")
    private String ghiChu;


    @Column(name = "NGAYDATHANG")
    private Date ngayDatHang;

    @Column(name = "NGAYXACNHAN")
    private Date ngayXacNhan;

    @Column(name = "NGAYVANCHUYEN")
    private Date ngayVanChuyen;

    @Column(name = "NGAYHUYDON")
    private Date ngayHuyDon;

    @Column(name = "NGAYHOANTHANH")
    private Date ngayHoanThanh;

    @Column(name = "NGAYTHANHTOAN")
    private Date ngayThanhToan;

    @Column(name = "TRANGTHAI")
    private Integer trangThai;

    @Column(name = "PHIVANCHUYEN")
    private BigDecimal phiVanChuyen;

    @Column(name = "TONGGIA")
    private BigDecimal tongGia;

    @Column(name = "GIA")
    private BigDecimal gia;

    @Column(name = "SOTIENGIAM")
    private BigDecimal soTienGiam;

    @Column(name = "NGAYTAO")
    private Date ngayTao;

    @Column(name = "NGAYCAPNHAT")
    private Date ngayCapNhat;

//    @ManyToOne
//    @JoinColumn(name = "ID")
//    private

    //VOUCHER
    //TAIKHOAN
}
