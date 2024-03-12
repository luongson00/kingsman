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
@Table(name = "GIOHANG")
public class GioHang {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGioHang;

//    @ManyToOne
//    @JoinColumn(name = "TAIKHOAN_ID")


    @Column(name = "TONGGIA")
    private BigDecimal tongGia;

    @Column(name = "TONGSOSP")
    private Integer tongSoSP;

    @Column(name = "NGAYTAO")
    private Date ngayTao;

    @Column(name = "NGAYCAPNHAT")
    private Date ngayCapNhat;

    @Column(name = "TRANGTHAI")
    private Integer trangThai;

}
