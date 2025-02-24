package com.example.bai17_2;

import android.os.Parcel;
import android.os.Parcelable;

public class SinhVien implements Parcelable {
    private String hoten;
    private int namSinh;


    public SinhVien(String hoten, int namSinh) {
        this.hoten = hoten;
        this.namSinh = namSinh;
    }
    protected SinhVien(Parcel in) {
        hoten = in.readString();
        namSinh = in.readInt();
    }

    public static final Creator<SinhVien> CREATOR = new Creator<SinhVien>() {
        @Override
        public SinhVien createFromParcel(Parcel in) {
            return new SinhVien(in);
        }

        @Override
        public SinhVien[] newArray(int size) {
            return new SinhVien[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(hoten);
        dest.writeInt(namSinh);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getHoTen() {
        return hoten;
    }

    public int getNamSinh() {
        return namSinh;
    }
}
