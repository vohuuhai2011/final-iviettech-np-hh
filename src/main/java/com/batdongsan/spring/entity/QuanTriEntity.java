package com.batdongsan.spring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QuanTri")
public class QuanTriEntity {

    @Id
    @Column(name = "UserName")
    private String userName;

    @Column(name = "Pw")
    private String pw;

    @ManyToOne
    @JoinColumn(name = "MaPQ")
    private QuanTriEntity maPQ;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private NhanVienEntity nhanVienEntity;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private ThanhVienEntity thanhVienEntity;

    @OneToMany(mappedBy = "userName", fetch = FetchType.EAGER)
    private List<BatDongSanEntity> batDongSanEntityList;

    public QuanTriEntity() {
    }

    public QuanTriEntity(String userName, String pw, QuanTriEntity maPQ) {
        this.userName = userName;
        this.pw = pw;
        this.maPQ = maPQ;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public QuanTriEntity getMaPQ() {
        return maPQ;
    }

    public void setMaPQ(QuanTriEntity maPQ) {
        this.maPQ = maPQ;
    }
}
