package com.example.vaibhav.quiz;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView t1 = (TextView)findViewById(R.id.tv1);
        int score = getIntent().getIntExtra("user",0);
        t1.setText(String.valueOf(score)+"/3");
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
        Intent i = new Intent(Main4Activity.this,MainActivity.class);
        startActivity(i);
    }
}
