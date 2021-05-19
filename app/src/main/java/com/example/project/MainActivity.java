package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window w = getWindow();
        getSupportActionBar().hide();
    }

    public void NewGame(View view) {
    Intent intent=new Intent(MainActivity.this, NewgameActivity.class);
    startActivity(intent);
    }
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

}