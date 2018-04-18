package com.example.administrator.androiddesignmode.adapterpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
//适配器模式
public class AdapterAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_aty);
        setTitle("适配器模式");
    }
}
