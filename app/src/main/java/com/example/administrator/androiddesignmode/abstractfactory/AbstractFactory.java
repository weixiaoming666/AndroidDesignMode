package com.example.administrator.androiddesignmode.abstractfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;

public class AbstractFactory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        setTitle("抽象工厂");
    }
}
