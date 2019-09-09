package com.example.latihanjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity{

//    EditText celcius = (EditText) findViewById(R.id.celcius);
//    EditText kelvin = (EditText) findViewById(R.id.kelvin);
//    EditText farenheit = (EditText) findViewById(R.id.farenheit);
//    EditText reamur = (EditText) findViewById(R.id.reamur);
//    Button konversi = (Button) findViewById(R.id.konversi);
//
//    String celcius2 = celcius.getText().toString().trim();
//    String kelvin2 = kelvin.getText().toString().trim();
//    String farenheit2 = farenheit.getText().toString().trim();
//    String reamur2 = reamur.getText().toString().trim();
//    double c = Double.parseDouble(celcius2);
//    double f = Double.parseDouble(farenheit2);
//    double k = Double.parseDouble(kelvin2);
//    double r = Double.parseDouble(reamur2);

    public void onClick(View view) {
        EditText c = (EditText) findViewById(R.id.celcius);
        EditText k = (EditText) findViewById(R.id.kelvin);
        EditText r = (EditText) findViewById(R.id.reamur);
        EditText f = (EditText) findViewById(R.id.farenheit);

        String cel = c.getText().toString().trim();
//        String kel = k.getText().toString().trim();
//        String rea = r.getText().toString().trim();
//        String far = f.getText().toString().trim();

        double cc = Double.parseDouble(cel);
//        double kk = Double.parseDouble(kel);
//        double rr = Double.parseDouble(rea);
//        double ff = Double.parseDouble(far);

        double kelvin3 = cc + 273;
        double farenheit3 = ((9*cc)/5)+32;
        double reamur3 = (4*cc)/5;

        k.setText(""+kelvin3);
        r.setText(""+reamur3);
        f.setText(""+farenheit3);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

//        konversi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                double ck = celcius_to_kelvin(c);
//                double cr = celcius_to_reamur(c);
//                double cf = celcius_to_farenheit(c);
//                kelvin.setText((int) celcius_to_kelvin(ck));
//                reamur.setText((int) celcius_to_reamur(cr));
//                farenheit.setText((int) celcius_to_farenheit(cf));
//            }
//        });
    }

    public double celcius_to_kelvin(double celcius){
        double kelvin3 = celcius + 273;
        return kelvin3;
    }

    public double celcius_to_farenheit(double celcius){
        double farenheit3 = ((9*celcius)/5)+32;
        return farenheit3;
    }

    public double celcius_to_reamur(double celcius){
        double kelvin = (4*celcius)/5;
        return kelvin;
    }

    }


