package com.batdongsan.spring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "NhomLoai")
public class NhomLoaiEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaNhom")
    private int maNhom;

    @Column(name = "TenNhom")
    private String tenNhom;

    @OneToMany(mappedBy = "maNhom", fetch = FetchType.EAGER)
    private List<BatDongSanEntity> batDongSanEntityList;
}
