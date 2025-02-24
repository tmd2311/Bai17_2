package com.example.bai17_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Man2 extends AppCompatActivity {

    Button btChuyenLai;
    TextView textTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man2);
        textTen= findViewById(R.id.textTen);

        SinhVien sv = getIntent().getParcelableExtra("SinhVien");
        btChuyenLai= findViewById(R.id.btChuyenlai);
        if (sv != null) {
            String hoTen = sv.getHoTen();
            int namSinh = sv.getNamSinh();
            textTen.setText("Xin chao: "+ hoTen+" Sinh nam: "+ namSinh);
        }
        btChuyenLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Man2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}