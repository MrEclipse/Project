package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    public static boolean isLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isLogin = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void NewGame(View view) {
        if (MainActivity.isLogin==true){
            Intent intent=new Intent(MainActivity.this, NewgameActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent=new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }

    public void Load(View view) {
    Intent intent=new Intent(MainActivity.this, LoadActivity.class);
    }


}
