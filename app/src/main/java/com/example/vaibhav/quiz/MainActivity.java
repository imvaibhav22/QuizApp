package com.example.vaibhav.quiz;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    public int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = (Button) findViewById(R.id.btn1);
        final Button b2 = (Button) findViewById(R.id.btn2);
        final Button b3 = (Button) findViewById(R.id.btn3);
        final Button b4 = (Button) findViewById(R.id.btn4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, Main2Activity.class);
                i1.putExtra("user",score);
                Toast.makeText(MainActivity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, Main2Activity.class);
                i1.putExtra("user",score);
                Toast.makeText(MainActivity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = score + 1;
                Intent i1 = new Intent(MainActivity.this, Main2Activity.class);
                i1.putExtra("user",score);
                Toast.makeText(MainActivity.this , "Correct Answer" ,Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, Main2Activity.class);
                i1.putExtra("user",score);
                Toast.makeText(MainActivity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });


    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent i = new Intent(MainActivity.this,MainActivity.class);
        startActivity(i);
    }
}
