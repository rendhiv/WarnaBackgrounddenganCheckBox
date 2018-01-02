package com.mobiledev.skydev.warnabackgrounddengancheckbox;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1, checkBox2, checkBox3;
    Button button;
    String judul = "Contoh Checkbox";
    String subtitle = "Belajar di mobiledev-id.com";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);

        getSupportActionBar().setTitle(judul);
        getSupportActionBar().setSubtitle(subtitle);


        button = (Button) findViewById(R.id.button1);

        //inisialisasi nilai object checkbox dan button


    }

    public void pilihWarna(View view) {

        //kondisi if else ketika checkbox di pilih 1 atau lebih dari 1 maka akan mengubah warna background
        if (checkBox1.isChecked() == true && checkBox2.isChecked() == true && checkBox3.isChecked() == true) {

            Toast.makeText(this, "Memilih Semua Warna", Toast.LENGTH_SHORT).show();
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#ffffff"));
        } else if (checkBox2.isChecked() == true && checkBox3.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#007E56"));

        } else if (checkBox3.isChecked() == true && checkBox1.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00B500"));
        } else if (checkBox2.isChecked() == true && checkBox1.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#802456"));

        } else if (checkBox1.isChecked() == true) {

            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#F44336"));//MERAH

        } else if (checkBox2.isChecked() == true) {

            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#2196F3"));//BIRU

        } else if (checkBox3.isChecked() == true) {

            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#4CAF50"));//HIJAU
        } else {
            Toast.makeText(this, "Anda belum memilih Warna", Toast.LENGTH_SHORT).show();
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#7f7f7f"));

        }
    }
}