package com.example.latihanjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void satu(View view) {
        Intent mart = new Intent(Main4Activity.this,MainActivity.class);
        startActivity(mart);
    }

    public void dua(View view) {
        Intent mart = new Intent(Main4Activity.this,Main2Activity.class);
        startActivity(mart);
    }

    public void tiga(View view) {
        Intent mart = new Intent(Main4Activity.this,Main3Activity.class);
        startActivity(mart);
    }

    public void empat(View view) {
        Intent mart = new Intent(Main4Activity.this,Main5Activity.class);
        startActivity(mart);
    }
}

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.satu:
//                Intent intent = new Intent(Main4Activity.this,MainActivity.class);
//                startActivity(intent);
//            case R.id.dua:
//                Intent intent2 = new Intent(Main4Activity.this,Main2Activity.class);
//                startActivity(intent2);
//            case R.id.tiga:
//                Intent intent3 = new Intent(Main4Activity.this,Main3Activity.class);
//                startActivity(intent3);
//            case R.id.empat:
//                Intent intent4 = new Intent(Main4Activity.this,Main5Activity.class);
//                startActivity(intent4);
//        }
//    }



