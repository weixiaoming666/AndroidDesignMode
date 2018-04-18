package com.example.administrator.androiddesignmode.utills;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/4/18.
 */

public class ToastUtill {
    public static  void  showToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
