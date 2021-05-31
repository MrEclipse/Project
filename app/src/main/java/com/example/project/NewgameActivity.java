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
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }
    public void Back(View view) {
        Intent intent=new Intent(NewgameActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void LevelFirst(View view){
        Intent intent=new Intent(NewgameActivity.this, LeveloneActivity.class);
        startActivity(intent);
    }
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}
//Идея! 3 д эффект выбора уровней. Нажмаешь на "новая игра" и выскакивает почти на весь экран картинка философа, с кем будешь спорить.
//И картинка плавно меняется на следующий.
