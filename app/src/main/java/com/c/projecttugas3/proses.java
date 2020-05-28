package com.c.projecttugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class proses extends AppCompatActivity {
    private TextView jdl,hsl;
    private ImageView gmb;
    private TextInputLayout i1,i2;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses);

        jdl=findViewById(R.id.txtJudul);
        hsl=findViewById(R.id.txtHasil);
        gmb=findViewById(R.id.img_bangun);
        i1=findViewById(R.id.InputNilai1);
        i2=findViewById(R.id.InputNilai2);
        Intent go=getIntent();
        i=getIntent();

        change(i);
    }

    private void change(Intent i){
        switch (i.getStringExtra("Bangun Datar")){
            case "Ketupat":
                getSupportActionBar().setTitle("Hitung Luas Belahketupat");
                jdl.setText("Belaketupat");
                gmb.setImageResource(R.drawable.img_ketupat);
                i1.setHint("Diagonal 1");
                i2.setHint("Diagobal 2");
                break;
            case "Tiga":
                getSupportActionBar().setTitle("Hitung Luas Segitiga");
                jdl.setText("Segitiga");
                gmb.setImageResource(R.drawable.img_tiga);
                i1.setHint("Alas");
                i2.setHint("Tinggi");
                break;
            case "Pesium":
                getSupportActionBar().setTitle("Hitung Luas Trapesium");
                jdl.setText("Trapesium");
                gmb.setImageResource(R.drawable.img_pesium);
                i1.setHint("Jumlah sisi sejajar");
                i2.setHint("Tinggi");
                break;
            case "Layang":
                getSupportActionBar().setTitle("Hitung luas Layang-layang");
                jdl.setText("Layang-layang");
                gmb.setImageResource(R.drawable.img_layang);
                i1.setHint("Diagonal 1");
                i2.setHint("DIagobal 2");
                break;
        }
    }
    public void hitung(View view){
        double a,b,c;
        String s_nilai1 = i1.getEditText().getText().toString();
        String s_nilai2 = i2.getEditText().getText().toString();
        if (!s_nilai1.equals("") || !s_nilai2.equals("")){
            a = Double.parseDouble(s_nilai1);
            b = Double.parseDouble(s_nilai2);
            c = (0.5*(a*b));
            switch (i.getStringExtra("Bangun Datar")){
                case "Ketupat":
                    hsl.setText("Luas Belah Ketupat " + c);
                    break;
                case "Tiga":
                    hsl.setText("Luas Segitiga " + c);
                    break;
                case "Pesium":
                    hsl.setText("Luas Trapesium " + c);
                    break;
                case "Layang":
                    hsl.setText("Luas Layang - Layang " + c);
                    break;
            }
        }else{
            Toast.makeText(proses.this, "semua inputan harus diisi!", Toast.LENGTH_SHORT).show();
        }
    }
}
