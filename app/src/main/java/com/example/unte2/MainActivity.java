package com.example.unte2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }
    public void Uyg4Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4.class);
        startActivity(i);
    }

    public void SS64Goster(View view) {
        Intent i = new Intent(MainActivity.this, SS64Activity.class);
        startActivity(i);
    }

    public void tamamGoster(View view) {
        Intent i = new Intent(MainActivity.this, SS65Activity.class);
        startActivity(i);
    }
}