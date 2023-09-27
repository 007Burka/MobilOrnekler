package com.example.unte2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SS65Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss65);
    }

    public void Onayla(View view) {
        Toast.makeText(this, "Onayla Metoduyum.", Toast.LENGTH_LONG).show();
    }
}z