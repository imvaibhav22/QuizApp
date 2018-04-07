package com.example.vaibhav.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    final Button b5 = (Button) findViewById(R.id.btn1);
    final Button b6 = (Button) findViewById(R.id.btn2);
    final Button b7 = (Button) findViewById(R.id.btn3);
    final Button b8 = (Button) findViewById(R.id.btn4);

        b5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i1 = new Intent(Main2Activity.this,Main3Activity.class);
            int score = getIntent().getIntExtra("user",0);
            i1.putExtra("user",score);
            Toast.makeText(Main2Activity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
            startActivity(i1);
        }
    });

        b6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i1 = new Intent(Main2Activity.this,Main3Activity.class);
            int score = getIntent().getIntExtra("user",0);
            score = score + 1;
            i1.putExtra("user",score);
            Toast.makeText(Main2Activity.this , "Correct Answer" ,Toast.LENGTH_SHORT).show();
            startActivity(i1);
        }
    });
        b7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i1 = new Intent(Main2Activity.this,Main3Activity.class);
            int score = getIntent().getIntExtra("user",0);
            i1.putExtra("user",score);
            Toast.makeText(Main2Activity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
            startActivity(i1);
        }
    });
        b8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i1 = new Intent(Main2Activity.this,Main3Activity.class);
            int score = getIntent().getIntExtra("user",0);
            i1.putExtra("user",score);
            Toast.makeText(Main2Activity.this , "Wrong Answer" ,Toast.LENGTH_SHORT).show();
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
        Intent i = new Intent(Main2Activity.this,MainActivity.class);
        startActivity(i);
    }

}
