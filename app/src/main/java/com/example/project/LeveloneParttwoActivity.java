package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class LeveloneParttwoActivity extends AppCompatActivity {
    public static boolean isLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isLogin = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelone_second);


        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }


}
