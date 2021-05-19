package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class NewgameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_game_main);
        getSupportActionBar().hide();
    }

    public void Back(View view) {
        Intent intent=new Intent(NewgameActivity.this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}