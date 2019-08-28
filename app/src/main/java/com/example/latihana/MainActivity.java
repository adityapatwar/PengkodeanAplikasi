package com.example.latihana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtNamaDepan,txtNamaBelakang;
    TextView txtOutput;
    Button btnTampilkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        txtNamaDepan = findViewById (R.id.txtNamaDepan);
        txtNamaBelakang = findViewById (R.id.txtNamaBelakang);
        txtOutput = findViewById (R.id.txtOutPut);
        btnTampilkan = findViewById (R.id.btnTampil);

        btnTampilkan.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String namadepan = txtNamaDepan.getText ().toString ();
                String namabelakang = txtNamaBelakang.getText ().toString ();
                String Output = namadepan + " " + namabelakang;

                txtOutput.setText (Output);
            }
        });

    }
}
