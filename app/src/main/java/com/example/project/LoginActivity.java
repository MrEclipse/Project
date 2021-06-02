package com.example.project;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.PreparedStatement;

public class LoginActivity extends AppCompatActivity {
    SQLiteDatabase db1;
    EditText name;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }
    public void Back(View view) {
        Intent intent=new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void Login(View view){
        name = findViewById(R.id.editTextTextPersonName);
        pass = findViewById(R.id.editTextTextPassword);
        db1 = getBaseContext().openOrCreateDatabase("db", MODE_PRIVATE, null);
        Intent intent=new Intent(LoginActivity.this, NewgameActivity.class);
        startActivity(intent);

    }
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}
//Идея! 3 д эффект выбора уровней. Нажмаешь на "новая игра" и выскакивает почти на весь экран картинка философа, с кем будешь спорить.
//И картинка плавно меняется на следующий.