package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class LeveloneParttwoActivity extends AppCompatActivity {
    public static boolean isLogin;
    public static int reputation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isLogin = false;
        reputation = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levelone_second);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        update(Spisok.index);


    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
    public void update(int index) {
        Log.d("index", String.valueOf(Spisok.index));
        String q = Spisok.questions.get(index);
        TextView h = (TextView) findViewById(R.id.textView18);
        h.setText(q);
        String a1 = Spisok.answers.get(q).get(0);
        TextView h1 = (TextView) findViewById(R.id.textView17);
        TextView h2 = (TextView) findViewById(R.id.textView16);
        TextView h3 = (TextView) findViewById(R.id.textView15);
        TextView h4 = (TextView) findViewById(R.id.textView14);

        String a2 = Spisok.answers.get(q).get(0);
        String a3 = Spisok.answers.get(q).get(1);
        String a4 = Spisok.answers.get(q).get(2);
        String a5 = Spisok.answers.get(q).get(3);
        h1.setText(a2);
        h2.setText(a3);
        h3.setText(a4);
        h4.setText(a5);

        exchange(3, h1, h2, h3, h4);

    }

    public void exchange(int num, TextView j1, TextView j2, TextView j3, TextView j4){

        float defX1 = j1.getX();
        float defY1 = j1.getY();

        float defX2 = j2.getX();
        float defY2 = j2.getY();

        float defX3 = j3.getX();
        float defY3 = j3.getY();

        float defX4 = j4.getX();
        float defY4 = j4.getY();

        if (num==1){

            j1.setX(defX1);
            j1.setY(defY1);

            j2.setX(defX2);
            j2.setY(defY2);

            j3.setX(defX3);
            j3.setY(defY3);

            j4.setX(defX4);
            j4.setY(defY4);

        }
        if (num==2){

            j1.setX(defX2);
            j1.setY(defY2);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX3);
            j3.setY(defY3);

            j4.setX(defX4);
            j4.setY(defY4);

        }
        if (num==3){

            j1.setX(defX3);
            j1.setY(defY3);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX4);
            j4.setY(defY4);

        }
        if (num==4){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==5){

            j1.setX(defX1);
            j1.setY(defY1);

            j2.setX(defX2);
            j2.setY(defY2);

            j3.setX(defX4);
            j3.setY(defY4);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==6){

            j1.setX(defX2);
            j1.setY(defY2);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX4);
            j3.setY(defY4);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==7){

            j1.setX(defX3);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX4);
            j3.setY(defY4);

            j4.setX(defX2);
            j4.setY(defY2);

        }
        if (num==8){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX3);
            j3.setY(defY3);

            j4.setX(defX2);
            j4.setY(defY2);

        }
        if (num==9){

            j1.setX(defX1);
            j1.setY(defY1);

            j2.setX(defX3);
            j2.setY(defY3);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX4);
            j4.setY(defY4);

        }
        if (num==10){

            j1.setX(defX2);
            j1.setY(defY2);

            j2.setX(defX3);
            j2.setY(defY3);

            j3.setX(defX1);
            j3.setY(defY1);

            j4.setX(defX4);
            j4.setY(defY4);

        }
        if (num==11){

            j1.setX(defX3);
            j1.setY(defY3);

            j2.setX(defX2);
            j2.setY(defY2);

            j3.setX(defX1);
            j3.setY(defY1);

            j4.setX(defX4);
            j4.setY(defY4);

        }
        if (num==12){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX2);
            j2.setY(defY2);

            j3.setX(defX1);
            j3.setY(defY1);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==13){

            j1.setX(defX1);
            j1.setY(defY1);

            j2.setX(defX3);
            j2.setY(defY3);

            j3.setX(defX4);
            j3.setY(defY4);

            j4.setX(defX2);
            j4.setY(defY2);

        }
        if (num==14){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==15){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==16){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==17){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==18){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==19){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==20){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==21){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==22){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==23){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
        if (num==24){

            j1.setX(defX4);
            j1.setY(defY4);

            j2.setX(defX1);
            j2.setY(defY1);

            j3.setX(defX2);
            j3.setY(defY2);

            j4.setX(defX3);
            j4.setY(defY3);

        }
    }

    public void right(View view) {
        update(Spisok.index++);
        reputation++;
    }

    public void wrong (View view){
        update(Spisok.index++);
        reputation--;
    }

}
