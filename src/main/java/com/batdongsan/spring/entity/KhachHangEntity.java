package com.batdongsan.spring.entity;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;

@Entity
@Table(name = "KhachHang")
public class KhachHangEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKH")
    private int maKH;

    @Column(name = "HoTenKH")
    @NotNull
    private String hotenKH;

    @Column(name = "DienThoai")
    private String dienThoai;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Email")
    private String email;
}
