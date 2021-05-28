package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class LeveloneActivity extends AppCompatActivity {
    public static boolean isLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isLogin = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelone_main);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
    public void Back(View view) {
        Intent intent=new Intent(LeveloneActivity.this, NewgameActivity.class);
        startActivity(intent);
    }

}
