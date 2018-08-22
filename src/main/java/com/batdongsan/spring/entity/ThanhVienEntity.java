package com.batdongsan.spring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ThanhVien")
public class ThanhVienEntity {

    @Id
    @Column(name = "UserName")
    private String userName;

    @Column(name = "Pw")
    private String pw;

    @Column(name = "HoTenTV")
    private String hotenTV;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "DienThoai")
    private String dienThoai;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "Email")
    private String email;

    @Column(name = "NgayDK")
    private Date ngayDK;

    @Column(name = "GhiChu")
    private String ghiChu; // hien thi day la Thanh Vien moi vua dang ky

    @OneToOne(mappedBy = "thanhVienEntity")
    private QuanTriEntity quanTri;

    public ThanhVienEntity() {
    }

    public ThanhVienEntity(String userName, String pw, String hotenTV, String diaChi, String dienThoai, String gioiTinh, String email, Date ngayDK, String ghiChu, QuanTriEntity quanTri) {
        this.userName = userName;
        this.pw = pw;
        this.hotenTV = hotenTV;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.ngayDK = ngayDK;
        this.ghiChu = ghiChu;
        this.quanTri = quanTri;
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

    public String getHotenTV() {
        return hotenTV;
    }

    public void setHotenTV(String hotenTV) {
        this.hotenTV = hotenTV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgayDK() {
        return ngayDK;
    }

    public void setNgayDK(Date ngayDK) {
        this.ngayDK = ngayDK;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public QuanTriEntity getQuanTri() {
        return quanTri;
    }

    public void setQuanTri(QuanTriEntity quanTri) {
        this.quanTri = quanTri;
    }
}

