package com.example.latihana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenghitungLuas extends AppCompatActivity {
    private EditText etpanjang,etlebar;
    private Button btnhitung;
    private TextView txtLuas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_menghitung_luas);
        getSupportActionBar ().setTitle ("Hitung Luas Persegi Panjang");

        etpanjang = findViewById (R.id.et_panjang);
        etlebar = findViewById (R.id.et_lebar);
        btnhitung = findViewById (R.id.btn_hitung);
        txtLuas = findViewById (R.id.txt_luas);

        btnhitung.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                String Panjang = etpanjang.getText ().toString ().trim ();
                String Lebar = etlebar.getText ().toString ().trim ();

                double p = Double.parseDouble (Panjang);
                double l = Double.parseDouble (Lebar);

                double luas =  p * l;
                txtLuas.setText ("Luas :"+luas);
            }
        });

    }
}
