package com.example.administrator.androiddesignmode.factorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
//工厂方法
public class FactoryMethodAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory_method_aty);
        setTitle("工厂方法");
    }
}
