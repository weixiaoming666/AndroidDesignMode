package com.example.administrator.androiddesignmode.chainofresponsibility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
//责任链模式
public class ChainOfResponsibilityAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_responsibility_aty);
        setTitle("责任链模式");
    }
}
