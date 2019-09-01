package com.example.latihana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator2 extends AppCompatActivity {
//    int[] buttonAngka = {R.id.n0, R.id.n1,R.id.n2, R.id.n3,R.id.n4,R.id.n5, R.id.n6, R.id.n7, R.id.n8, R.id.n9};
//    int[] buttonOperasi = {R.id.btn_p,R.id.btn_m, R.id.btn_k, R.id.btn_b, R.id.titik};
    String hasil = "";



//    TextView screen;
//    boolean lastNumber;
//    boolean lastKoma;
//    boolean stateError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_kalkulator2);
        TextView screen = findViewById (R.id.hasil);

        Button n0 = findViewById(R.id.n0);
        Button n1 = findViewById(R.id.n1);
        Button n2 = findViewById(R.id.n2);
        Button n3 = findViewById(R.id.n3);
        Button n4 = findViewById(R.id.n4);
        Button n5 = findViewById(R.id.n5);
        Button n6 = findViewById(R.id.n6);
        Button n7 = findViewById(R.id.n7);
        Button n8 = findViewById(R.id.n8);
        Button n9 = findViewById(R.id.n9);
        Button plus = findViewById(R.id.btn_p);
        Button minus = findViewById(R.id.btn_m);
        Button kali = findViewById(R.id.btn_k);
        Button bagi = findViewById(R.id.btn_b);
        Button titik = findViewById(R.id.titik);

        Button[] button= {n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,plus,minus,kali,bagi,titik};

        for(int x = 0 ; x<button.length;x++){
            initbtn(button[x]);
        }

        Button jumlahkan =  findViewById(R.id.btn_hitung);
        jumlahkan.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                TextView screen =  findViewById(R.id.hasil);
                String screenstring = screen.getText().toString();
                String angka_kedua = "0";
                String angka = "0";
                double number = 0;
                double number_kedua = 0;
                String hasil_kedua = "";
                int b = 0;



                for(int teksdiscreen = 0;teksdiscreen<screenstring.length();teksdiscreen++){
                    if(screenstring.charAt(teksdiscreen) == '+'){
                        int a;

                        for(a = teksdiscreen+1;a<screenstring.length();a++){
                            if(screenstring.charAt(a) == '+'||screenstring.charAt(a) == '*'||screenstring.charAt(a) == '/'||screenstring.charAt(a) == '-'){
                                break;
                            }else{
                                angka = angka + String.valueOf(screenstring.charAt(a));
                            }
                        }
                        if(b==0){

                        }else{
                            angka_kedua = hasil_kedua;
                        }
                        b++;
                        teksdiscreen = a-1;
                        number = Double.parseDouble(angka);
                        number_kedua = Double.parseDouble(angka_kedua);
                        if(b==0){
                            hasil_kedua = String.valueOf((Double.parseDouble(hasil_kedua) + (number_kedua+number)));
                        }else{
                            hasil_kedua = String.valueOf(number_kedua+number);
                        }
                        number = 0;
                        number_kedua = 0;
                        angka_kedua = "0";
                        angka = "0";

                    } else if(screenstring.charAt(teksdiscreen) == '-'){
                        int a;

                        for(a = teksdiscreen+1;a<screenstring.length();a++){
                            if(screenstring.charAt(a) == '+'||screenstring.charAt(a) == '*'||screenstring.charAt(a) == '/'||screenstring.charAt(a) == '-'){
                                break;
                            }else{
                                angka = angka + String.valueOf(screenstring.charAt(a));
                            }
                        }
                        if(b==0){

                        }else{
                            angka_kedua = hasil_kedua;
                        }
                        b++;
                        teksdiscreen = a-1;
                        number = Double.parseDouble(angka);
                        number_kedua = Double.parseDouble(angka_kedua);
                        if(b==0){
                            hasil_kedua = String.valueOf((Double.parseDouble(hasil_kedua) + (number_kedua-number)));
                        }else{
                            hasil_kedua = String.valueOf(number_kedua-number);
                        }
                        number = 0;
                        number_kedua = 0;
                        angka_kedua = "0";
                        angka = "0";

                    }else if(screenstring.charAt(teksdiscreen) == '*'){
                        int a;

                        for(a = teksdiscreen+1;a<screenstring.length();a++){
                            if(screenstring.charAt(a) == '+'||screenstring.charAt(a) == '*'||screenstring.charAt(a) == '/'||screenstring.charAt(a) == '-'){
                                break;
                            }else{
                                angka = angka + String.valueOf(screenstring.charAt(a));
                            }
                        }
                        if(b==0){

                        }else{
                            angka_kedua = hasil_kedua;
                        }
                        b++;
                        teksdiscreen = a-1;
                        number = Double.parseDouble(angka);
                        number_kedua = Double.parseDouble(angka_kedua);
                        if(b==0){
                            hasil_kedua = String.valueOf((Double.parseDouble(hasil_kedua) + (number_kedua*number)));
                        }else{
                            hasil_kedua = String.valueOf(number_kedua*number);
                        }
                        number = 0;
                        number_kedua = 0;
                        angka_kedua = "0";
                        angka = "0";

                    }
                    else if(screenstring.charAt(teksdiscreen) == '/'){
                        int a;

                        for(a = teksdiscreen+1;a<screenstring.length();a++){
                            if(screenstring.charAt(a) == '+'||screenstring.charAt(a) == '*'||screenstring.charAt(a) == '/'||screenstring.charAt(a) == '-'){
                                break;
                            }else{
                                angka = angka + String.valueOf(screenstring.charAt(a));
                            }
                        }
                        if(b==0){

                        }else{
                            angka_kedua = hasil_kedua;
                        }
                        b++;
                        teksdiscreen = a-1;
                        number = Double.parseDouble(angka);
                        number_kedua = Double.parseDouble(angka_kedua);
                        if(b==0){
                            hasil_kedua = String.valueOf((Double.parseDouble(hasil_kedua) + (number_kedua/number)));
                        }else{
                            hasil_kedua = String.valueOf(number_kedua/number);
                        }
                        number = 0;
                        number_kedua = 0;
                        angka_kedua = "0";
                        angka = "0";

                    }else {
                        angka_kedua = angka_kedua + String.valueOf (screenstring.charAt (teksdiscreen));
                        System.out.println (angka_kedua);
                    }

                }
                screen.setText(hasil_kedua);
                hasil = "";


            }
        });
        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil = "";
                TextView screen = findViewById(R.id.hasil);
                screen.setText(hasil);
            }
        });

    }

    private void initbtn(final Button btn) {
        btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                hasil = hasil + btn.getText ().toString ();
                TextView screen = findViewById (R.id.hasil);
                screen.setText (hasil);
                if(screen.length ()>=10){
                    screen.setTextSize (20);
                }
                if(screen.length ()>20){
                    screen.setTextSize (10);
                }

            }
        });
    }

//    private void setAngkaOnClickListener() {
//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Button button = (Button) v;
//                if (stateError) {
//                    screen.setText(button.getText());
//                    stateError = false;
//                } else {
//                    screen.append(button.getText());
//                }
//                lastNumber = true;
//            }
//        };
//        for (int id : buttonAngka) {
//            findViewById(id).setOnClickListener(listener);
//        }
//    }
}
