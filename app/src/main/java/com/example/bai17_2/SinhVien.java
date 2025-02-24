package com.example.bai17_2;

public class SinhVien {
    private String hoten;
    private int namSinh;


    public SinhVien(String hoten, int namSinh) {
        this.hoten = hoten;
        this.namSinh = namSinh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getHoten() {
        return hoten;
    }

    public int getNamSinh() {
        return namSinh;
    }
}
