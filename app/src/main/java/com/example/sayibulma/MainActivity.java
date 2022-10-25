package com.example.sayibulma;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import java.util.Scanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
   int hak = 3;
    Random rnd = new Random();
    int randomSayi = rnd.nextInt(10);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onclick (View v){
        TextView hakTxt = (TextView) findViewById(R.id.hak);
        Button btn = (Button) findViewById(R.id.button);
        hakTxt.setText(""+ hak);
        hak--;

        if(hak==0)
        {
            System.out.println("HAKKINIZ BİTTİ");
        }

        EditText tahmin = (EditText) findViewById(R.id.tahmin);
        TextView sonuc = (TextView) findViewById(R.id.sonuc);
        float tahminSayi = Float.parseFloat(tahmin.getText().toString());
        System.out.println(tahminSayi);
        System.out.println(randomSayi);
        if (tahminSayi == randomSayi)
        {
            sonuc.setText("Dogru Tahmin Ettiniz");
        }



    }
}