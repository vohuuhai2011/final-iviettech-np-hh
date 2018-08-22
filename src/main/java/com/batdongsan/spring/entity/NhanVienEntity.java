package com.batdongsan.spring.entity;

import javax.persistence.*;

@Entity
@Table(name = "NhanVien")
public class NhanVienEntity {

    @Id
    @Column(name = "UserName")
    private String userName;

    @Column(name = "MaNV")
    private String hotenNV;

    @Column(name = "ChucVu")
    private String chucVu;

    @Column(name = "DienThoai")
    private String dienThoai;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Email")
    private String email;

    @Column(name = "Facebook")
    private String facebook;

    @OneToOne(mappedBy = "nhanVienEntity")
    private QuanTriEntity quanTri;

    public NhanVienEntity() {
    }

    public NhanVienEntity(String userName, String hotenNV, String chucVu, String dienThoai, String gioiTinh, String diaChi, String email, String facebook, QuanTriEntity quanTri) {
        this.userName = userName;
        this.hotenNV = hotenNV;
        this.chucVu = chucVu;
        this.dienThoai = dienThoai;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.email = email;
        this.facebook = facebook;
        this.quanTri = quanTri;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHotenNV() {
        return hotenNV;
    }

    public void setHotenNV(String hotenNV) {
        this.hotenNV = hotenNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public QuanTriEntity getQuanTri() {
        return quanTri;
    }

    public void setQuanTri(QuanTriEntity quanTri) {
        this.quanTri = quanTri;
    }
}
