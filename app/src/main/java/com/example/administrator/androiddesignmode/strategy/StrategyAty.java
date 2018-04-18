package com.example.administrator.androiddesignmode.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
// 策略模式
public class StrategyAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy_aty);
        setTitle("策略模式");
    }
}
