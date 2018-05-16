package com.example.administrator.androiddesignmode.base;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.androiddesignmode.R;

public  class BaseAty extends AppCompatActivity {
    private TextView title;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {


    }

    public void addBase(View view) {
    }

    public void backBase(View view) {
        finish();
    }
    protected void setTitle(String title){
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();//隐藏状态栏
        this.title = (TextView) findViewById(R.id.tv_title_base);
        this.title.setText(title);
    };


}
