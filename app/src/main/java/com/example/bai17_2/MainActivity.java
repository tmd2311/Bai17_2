package com.example.bai17_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btChuyen;
    EditText editTen, editNam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btChuyen = findViewById(R.id.btChuyen);
        editTen= findViewById(R.id.editTen);
        editNam = findViewById(R.id.editNam);
        btChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Man2.class);
                String ht= editTen.getText().toString();
                int nam= Integer.parseInt(editNam.getText().toString());
                intent.putExtra("hoten", ht);
                intent.putExtra("nam", nam);
                startActivity(intent);
            }
        });

    }
}