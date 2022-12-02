package com.example.attendancemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {
    private Button sign,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.activity_dashboard);
        sign=findViewById(R.id.signup);
        login=findViewById(R.id.login);
        sign.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.login:
                Intent intent = new Intent(this, com.example.attendancemanager.signin.class);
                startActivity(intent);
                break;
            case R.id.signup:
                Intent intent1 = new Intent(this, com.example.attendancemanager.page1.class);
                startActivity(intent1);
                break;
        }

    }
}