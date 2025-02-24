package com.example.bai17_2;

import android.os.Parcel;
import android.os.Parcelable;

public class SinhVien implements Parcelable {
    private int id;
    private String hoten;
    private int namSinh;

    // Constructor đầy đủ
    public SinhVien(int id, String hoten, int namSinh) {
        this.id = id;
        this.hoten = hoten;
        this.namSinh = namSinh;
    }

    // Constructor cho Parcelable
    protected SinhVien(Parcel in) {
        id = in.readInt(); // Đọc id
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
        dest.writeInt(id); // Ghi id
        dest.writeString(hoten);
        dest.writeInt(namSinh);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoten;
    }

    public int getNamSinh() {
        return namSinh;
    }
}
