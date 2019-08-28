package com.example.latihana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KonversiSuhu extends AppCompatActivity {
    EditText vcelcius,vfarenheit,vreamur,vkelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_konversi_suhu);
        vcelcius = findViewById (R.id.et_Celcius);
        vfarenheit = findViewById (R.id.et_farenheit);
        vreamur = findViewById (R.id.et_reamur);
        vkelvin = findViewById (R.id.et_kelvin);

        Button konversi = findViewById (R.id.btnKonversi);

        konversi.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
            String Celcius = vcelcius.getText ().toString ();

            double celci = Double.parseDouble (Celcius);
            double farenh,reamur,kelvin;

            farenh = faren(celci);
            reamur = reamur(celci);
            kelvin = kelvin(celci);

            vfarenheit.setText (farenh+"");
            vreamur.setText (reamur+"");
            vkelvin.setText (kelvin+"");

            }
        });
    }

    private Double faren(Double c){
        double faren = c* 1.8 + 32;
        return faren;
    }

    private Double reamur(Double c){
        double reamur = c* 0.8;
        return reamur;
    }

    private Double kelvin(Double c){
        double kelvin = c+ 273.15;
        return kelvin;
    }
}
