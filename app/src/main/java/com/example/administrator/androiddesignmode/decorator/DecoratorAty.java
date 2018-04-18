package com.example.administrator.androiddesignmode.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
//装饰者模式
public class DecoratorAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator_aty);
        setTitle("装饰着模式");
    }
}
