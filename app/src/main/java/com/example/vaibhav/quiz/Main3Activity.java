package com.example.vaibhav.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Button b9 = (Button) findViewById(R.id.btn1);
        final Button b10 = (Button) findViewById(R.id.btn2);
        final Button b11 = (Button) findViewById(R.id.btn3);
        final Button b12 = (Button) findViewById(R.id.btn4);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Main3Activity.this,Main4Activity.class);
                int score = getIntent().getIntExtra("user",0);
                score = score + 1;
                i1.putExtra("user",score);
                Toast.makeText(Main3Activity.this , "Correct Answer" ,Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Main3Activity.this,Main4Activity.class);
                int score = getIntent().getIntExtra("user",0);
                i1.putExtra("user",score);
                Toast.makeText(Main3Activity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Main3Activity.this,Main4Activity.class);
                int score = getIntent().getIntExtra("user",0);
                i1.putExtra("user",score);
                Toast.makeText(Main3Activity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Main3Activity.this,Main4Activity.class);
                int score = getIntent().getIntExtra("user",0);
                i1.putExtra("user",score);
                Toast.makeText(Main3Activity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
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
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Intent i = new Intent(Main3Activity.this,MainActivity.class);
        startActivity(i);
    }

}

