package com.example.administrator.androiddesignmode.memento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.androiddesignmode.R;
//备忘录模式
public class MementoAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento_aty);
        setTitle("备忘录模式");
    }
}
