package com.example.fragmentloginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().hide();
            Toast.makeText(this, "hehhehe", Toast.LENGTH_SHORT).show();
        }
    }
}