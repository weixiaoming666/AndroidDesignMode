package com.example.administrator.androiddesignmode.singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;

public class SingletonAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_aty);
        setTitle("单例模式");
    }
}
