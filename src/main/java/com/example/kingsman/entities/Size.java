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
@Table(name = "SIZE")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer idSize;

    @Column(name = "TEN")
    private String tenSize;

    @Column(name = "NGAYTAO")
    Date ngayTao;

    @Column(name = "NGAYCAPNHAT")
    Date ngayCapNhat;

    @Column(name = "TRANGTHAI")
    Integer trangThai;
}
