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
@Table(name = "DOITRA")
public class DoiTra {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDoiTra;

    @ManyToOne
    @JoinColumn(name = "HOADON_ID")
    private HoaDon hoaDon;

    @Column(name = "NGAYBATDAU")
    private Date ngayBatDau;

    @Column(name = "NGAYKETHUC")
    private Date ngayKetThuc;

    @Column(name = "LYDO")
    private String lyDo;

    @Column(name = "TRANGTHAI")
    private Integer trangThai;

}
