package com.example.administrator.androiddesignmode.sixrule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
//单一职责原则
public class SingleResponsibilityAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_responsibility_aty);
        setTitle("单一职责原则");
    }
}
