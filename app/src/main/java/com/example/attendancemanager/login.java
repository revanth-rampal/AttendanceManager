package com.example.attendancemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class login extends AppCompatActivity implements View.OnClickListener {
    private Button bac,logn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.activity_login);
        bac=findViewById(R.id.back);
        logn=findViewById(R.id.login);
        bac.setOnClickListener(this);
        logn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.back:
                Intent intent = new Intent(this, com.example.attendancemanager.Dashboard.class);
                startActivity(intent);
                break;
            case R.id.login:
                Intent intent1 = new Intent(this, com.example.attendancemanager.MainActivity.class);
                startActivity(intent1);
                break;
        }

    }
}