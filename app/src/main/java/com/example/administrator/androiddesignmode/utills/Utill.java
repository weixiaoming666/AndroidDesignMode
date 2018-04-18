package com.example.administrator.androiddesignmode.utills;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2018/4/18.
 */

public class Utill {
    public static  void jump2NewAty(Context context,Class  s){
        Intent intent  =  new Intent(context,s);
        context.startActivity(intent);
    }
}
