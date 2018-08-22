package com.batdongsan.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "ChiTietBDS")
public class ChiTietBDSEntity {
    @Id
    @Column(name = "MaBDS")
    private int maBDS;

    @Column(name = "MaBDS")
    private double gia;

    @Column(name = "MaBDS")
    private String dienTich;

    @Column(name = "MaBDS")
    private String diaChi;

    @Column(name = "MaBDS")
    private String moTa;

    @Column(name = "MaBDS")
    private String khuVuc;

    @Column(name = "MaBDS")
    private String Anh;

    @Column(name = "MaBDS")
    private int phongTam;

    @Column(name = "MaBDS")
    private int phongNgu;

    @Column(name = "MaBDS")
    private boolean ChoDauXe;

    @OneToOne(mappedBy = "chiTietBDSEntity")
    private BatDongSanEntity batDongSan;
}
