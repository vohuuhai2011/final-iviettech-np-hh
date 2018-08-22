package com.batdongsan.spring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BatDongSan")
public class BatDongSanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaBDS")
    private int maBDS;

    @Column(name = "TenBDS")
    private String tenBDS;

    @ManyToOne
    @JoinColumn(name = "MaNhom")
    private NhomLoaiEntity maNhom;

    @ManyToOne
    @JoinColumn(name = "MaLoaiBDS")
    private LoaiBatDongSanEntity maLoaiBDS;

    @ManyToOne
    @JoinColumn(name = "UserName")
    private BatDongSanEntity userName;

    @Column(name = "NgayDang")
    @Temporal(TemporalType.DATE)
    private Date ngayDang;

    @Column(name = "TinhTrang")
    private String tinhTrang;

    @Column(name = "GhiChu")
    private String ghiChu;

    @Column(name = "KiemDuyet")
    private boolean kiemDuyet;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private ChiTietBDSEntity chiTietBDSEntity;


}
