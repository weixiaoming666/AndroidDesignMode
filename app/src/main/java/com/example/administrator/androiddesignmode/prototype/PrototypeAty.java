package com.example.administrator.androiddesignmode.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
//原型模式
public class PrototypeAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype_aty);
        setTitle("原型模式");
    }
}
