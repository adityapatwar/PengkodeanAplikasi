package com.example.latihana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class Kalkulator extends AppCompatActivity implements View.OnClickListener {
    EditText vTextA,vTextB,vTextC;

    protected float yTectA,yTextB,yTextC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_kalkulator);

        vTextA = findViewById (R.id.txtA);
        vTextB = findViewById (R.id.txtB);
        vTextC = findViewById (R.id.txtC);

        Button vBtnTambah = findViewById (R.id.btnTambah);
        Button vBtnKurang = findViewById (R.id.btnKurang);
        Button vBtnKali = findViewById (R.id.btnKali);
        Button vBtnBagi = findViewById (R.id.btnBagi);

        vBtnTambah.setOnClickListener (this);
        vBtnKurang.setOnClickListener (this);
        vBtnKali.setOnClickListener (this);
        vBtnBagi.setOnClickListener (this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId ()){
            case R.id.btnTambah :
                yTextC = yTectA + yTextB;
                vTextC.setText (yTextC+"");
                break;
            case R.id.btnKurang :
                yTextC = yTectA - yTextB;
                vTextC.setText (yTextC+"");
                break;
            case R.id.btnKali :
                yTextC = yTectA * yTextB;
                vTextC.setText (yTextC+"");
                break;
            case R.id.btnBagi :
                yTextC = yTectA / yTextB;
                vTextC.setText (yTextC+"");
                break;


        }


    }
}
