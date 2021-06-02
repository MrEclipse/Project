package com.example.project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

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
            finish();
        }
        else {
            Intent intent=new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public static void createDialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Диалог")
                .setMessage("Текст в диалоге")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(activity,"Нажата кнопка 'OK' " + LeveloneParttwoActivity.reputation,Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(activity,"Нажата кнопка 'Отмена'",Toast.LENGTH_SHORT).show();
                    }
                });
        builder.create().show();
    }



    public void Load(View view) {
    Intent intent=new Intent(MainActivity.this, LoadActivity.class);
    }
}
