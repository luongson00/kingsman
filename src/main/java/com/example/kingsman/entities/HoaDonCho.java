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
@Table(name = "HOADONCHO")
public class HoaDonCho {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHoaDonCho;

    @ManyToOne
    @JoinColumn(name = "HOADON_ID")
    private HoaDon hoaDon;

    @Column(name = "TENKH")
    private String tenKH;

    @Column(name = "NGAYTAO")
    private Date ngayTao;

    @Column(name = "NGAYTT")
    private Date ngayTT;

    @Column(name = "TRANGTHAI")
    private Integer trangThai;

}
