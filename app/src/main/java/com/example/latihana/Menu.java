package com.example.latihana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_menu);

        btn1 = findViewById (R.id.btn1);
        btn2 = findViewById (R.id.btn2);
        btn3 = findViewById (R.id.btn3);
        btn4 = findViewById (R.id.btn4);

        btn1.setOnClickListener (this);
        btn2.setOnClickListener (this);
        btn3.setOnClickListener (this);
        btn4.setOnClickListener (this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId ()) {

            case R.id.btn1:
                Intent moveIntent = new Intent (Menu.this, Kalkulator.class);
                startActivity (moveIntent);
                break;
            case R.id.btn2:
                Intent moveIntentq = new Intent (Menu.this, MenghitungLuas.class);
                startActivity (moveIntentq);
                break;
            case R.id.btn3:
                Intent moveIntentw = new Intent (Menu.this, KonversiSuhu.class);
                startActivity (moveIntentw);
                break;
            case R.id.btn4:
                Intent moveIntente = new Intent (Menu.this, Kalkulator2.class);
                startActivity (moveIntente);
                break;
        }
    }
}
