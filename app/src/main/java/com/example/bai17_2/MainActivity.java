package com.example.bai17_2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btChuyen;
    EditText editTen, editNam, txtID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btChuyen = findViewById(R.id.btChuyen);
        editTen= findViewById(R.id.editTen);
        editNam = findViewById(R.id.editNam);
        txtID= findViewById(R.id.txtID);


        btChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Man2.class);
                int id= Integer.parseInt(txtID.getText().toString());
                intent.putExtra("id", id);
                startActivity(intent);

                SinhVien sv = getIntent().getParcelableExtra("sinhvien");

                if (sv != null) {
                    String hoTen = sv.getHoTen();
                    int namSinh = sv.getNamSinh();
                    // Xử lý dữ liệu...

                    editTen.setText(hoTen);
                    editNam.setText(namSinh);
                }
            }
        });

    }
}