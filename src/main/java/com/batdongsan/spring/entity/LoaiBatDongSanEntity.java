package com.batdongsan.spring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "LoaiBatDongSan")
public class LoaiBatDongSanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaLoaiBDS")
    private int maLoaiBDS;

    @Column(name = "TenLoaiBDS")
    private String tenLoaiBDS;

    @OneToMany(mappedBy = "maLoaiBDS", fetch = FetchType.EAGER)
    private List<BatDongSanEntity> batDongSanEntityList;




}
