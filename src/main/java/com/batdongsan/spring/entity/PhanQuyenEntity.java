package com.batdongsan.spring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PhanQuyen")
public class PhanQuyenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaPQ")
    private int maPQ;

    @Column(name = "TenPQ")
    private String tenPQ;

    @OneToMany(mappedBy = "maPQ", fetch = FetchType.EAGER)
    private List<QuanTriEntity> quanTriEntityList;

    public PhanQuyenEntity() {
    }

    public PhanQuyenEntity(String tenPQ, List<QuanTriEntity> quanTriEntityList) {
        this.tenPQ = tenPQ;
        this.quanTriEntityList = quanTriEntityList;
    }

    public int getMaPQ() {
        return maPQ;
    }

    public void setMaPQ(int maPQ) {
        this.maPQ = maPQ;
    }

    public String getTenPQ() {
        return tenPQ;
    }

    public void setTenPQ(String tenPQ) {
        this.tenPQ = tenPQ;
    }

    public List<QuanTriEntity> getQuanTriEntityList() {
        return quanTriEntityList;
    }

    public void setQuanTriEntityList(List<QuanTriEntity> quanTriEntityList) {
        this.quanTriEntityList = quanTriEntityList;
    }
}
