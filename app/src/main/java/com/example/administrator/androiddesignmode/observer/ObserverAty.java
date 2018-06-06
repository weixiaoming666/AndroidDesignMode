package com.example.administrator.androiddesignmode.observer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.MainActivity;
import com.example.administrator.androiddesignmode.R;
//观察者模式
public class ObserverAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_aty);
        setTitle("观察者模式哦");

        startActivity(new Intent(this, MainActivity.class));
    }
}
