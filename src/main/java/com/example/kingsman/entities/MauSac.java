package com.example.kingsman.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MAUSAC")
public class MauSac {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMauSac;

    @Column(name = "TEN")
    private String tenMauSac;

    @Column(name = "NGAYTAO")
    Date ngayTao;

    @Column(name = "NGAYCAPNHAT")
    Date ngayCapNhat;

    @Column(name = "TRANGTHAI")
    Integer trangThai;
}
