package com.example.tidy1.reflectnote;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Handler handler= new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(getBaseContext(),LoginActivity.class);
            startActivity(intent);
            finish();}
                            }

        ,3000);{}
    }
}
