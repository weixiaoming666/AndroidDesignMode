package com.example.administrator.androiddesignmode.facade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
//外观模式
public class FacadeAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade_aty);
        setTitle("外观模式");

    }
}
