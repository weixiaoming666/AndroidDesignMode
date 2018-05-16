package com.example.administrator.androiddesignmode.utills;

import android.app.AlertDialog;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.androiddesignmode.R;

/**
 * Created by Administrator on 2018/4/18.
 */

public class ToastUtill {
    public static  void  showToast(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
  public static  void  showTextdialog(Context context,String msg){
       // 创建对话框构建器
      AlertDialog.Builder builder = new AlertDialog.Builder(context);
      // 获取布局
      View view2 = View.inflate(context, R.layout.showtext, null);
      // 获取布局中的控件
      final TextView username = (TextView) view2.findViewById(R.id.tv_alterdialog_showtext);
      final Button button = (Button) view2.findViewById(R.id.BT_alterdialog_showtext);
      username.setText(msg);
      // 设置参数
      builder.setTitle("认真看").setIcon(R.drawable.bg_tv_content_main)
              .setView(view2);
      // 创建对话框
      final AlertDialog alertDialog = builder.create();
      button.setOnClickListener(new View.OnClickListener() {

          @Override
          public void onClick(View v) {
              // TODO Auto-generated method stub
              alertDialog.dismiss();// 对话框消失
          }

      });
      alertDialog.show();
    }
}
