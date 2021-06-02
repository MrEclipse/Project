package com.example.project;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;


import androidx.appcompat.app.AppCompatActivity;


public class LeveloneParttwoActivity extends AppCompatActivity {
    public static boolean isLogin;
    public static int reputation;
    public static int lvl = 1;
    private boolean firstShow = true;

    Button h1;
    Button h2;
    Button h3;
    Button h4;
    Button b2;
    Dialog win;

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isLogin = false;
        reputation = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelone_second);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        win = new Dialog(this);
        win.requestWindowFeature(Window.FEATURE_NO_TITLE);
        win.setContentView(R.layout.win_dialog);
        win.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        win.setCancelable(false);

        b2 = win.findViewById(R.id.button);
        txt = win.findViewById(R.id.result);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LeveloneParttwoActivity.this, NewgameActivity.class);
                startActivity(intent);
                finish();
                win.dismiss();
            }
        });

        h1 = (Button) findViewById(R.id.textView17);
        h2 = (Button) findViewById(R.id.textView16);
        h3 = (Button) findViewById(R.id.textView15);
        h4 = (Button) findViewById(R.id.textView14);
        update();
    }

    @Override

    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
    public void update() {
        String q = Spisok.questions.get(Spisok.index);
        TextView h = (TextView) findViewById(R.id.textView18);
        h.setText(q);
        String a1 = Spisok.answers.get(q).get(0);

        ArrayList<String> ans = Spisok.answers.get(q);
        Collections.shuffle(ans);

        h1.setText(ans.get(0));
        h2.setText(ans.get(1));
        h3.setText(ans.get(2));
        h4.setText(ans.get(3));
    }

    public void click(View view) {
        Button b = (Button) view;
        if (lvl >= 10) {
            win.show();
            txt.setText("Ваш результат - " + reputation +"/10 правильных.");
            reputation = 0;
            Spisok.index = 0;
            lvl=0;
        }
        else{
            if (b.getText().toString().equals(Spisok.rightAnswer.get(Spisok.index))){
                Toast.makeText(this,"ok", Toast.LENGTH_LONG).show();

                reputation++;

            }
            else{
                Toast.makeText(this,"error", Toast.LENGTH_LONG).show();
            }
            Spisok.index++;
            update();
        }

        lvl++;

    }
}
