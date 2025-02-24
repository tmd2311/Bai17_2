package com.example.bai17_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Man2 extends AppCompatActivity {

    Button btChuyenLai;
    ArrayList<SinhVien> danhSachSV;
    TextView textTen;
    SinhVien sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man2);
        textTen= findViewById(R.id.textTen);
        btChuyenLai= findViewById(R.id.btChuyenlai);
        danhSachSV = new ArrayList<>();
        danhSachSV.add(new SinhVien(1, "Nguyen Van A", 2000));
        danhSachSV.add(new SinhVien(2, "Tran Thi B", 2001));
        danhSachSV.add(new SinhVien(3, "Le Van C", 1999));
//        SinhVien sv = getIntent().getParcelableExtra("SinhVien");
//
//        if (sv != null) {
//            String hoTen = sv.getHoTen();
//            int namSinh = sv.getNamSinh();
//            textTen.setText("Xin chao: "+ hoTen+" Sinh nam: "+ namSinh);
//        }

//        Bundle bundle = getIntent().getBundleExtra("mybundle");
//        if (bundle != null) {
//            String hoTen = bundle.getString("hoten");
//            int namSinh = bundle.getInt("namsinh");
//
//            // Xử lý dữ liệu, ví dụ hiển thị lên TextView
//            textTen.setText("Xin chao: "+ hoTen+" Sinh nam: "+ namSinh);
//        }
        Intent intent = getIntent();
        int id = intent.getIntExtra("id", 0);
        sv = null;

        for (int i = 0; i < danhSachSV.size(); i++) {
            Log.d("DEBUG", "Đang kiểm tra sinh viên: " + danhSachSV.get(i).getHoTen());
            if (danhSachSV.get(i).getId() == id) {
                sv = danhSachSV.get(i);
                break;
            }
        }

        if (sv != null) {
            textTen.setText("Xin chào: " + sv.getHoTen() + " - Sinh năm: " + sv.getNamSinh());
        } else {
            textTen.setText("Không tìm thấy sinh viên có ID: " + id);
            Toast.makeText(Man2.this, "Không có sinh viên này", Toast.LENGTH_SHORT).show();
        }

        btChuyenLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sv != null) {
                    Intent intent1 = new Intent(Man2.this, MainActivity.class);
                    intent1.putExtra("sinhvien", sv);
                    startActivity(intent1);
                } else {
                    Toast.makeText(Man2.this, "Không có sinh viên này", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}