package com.example.smk_screen;

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

    public void onClickGreen(View view){
        Intent intent = new Intent(MainActivity.this, GreenActivity.class);
        startActivity(intent);
    }

    public void onClickBlue(View view){
        Intent intent = new Intent(MainActivity.this, BlueActivity.class);
        startActivity(intent);
    }
}
