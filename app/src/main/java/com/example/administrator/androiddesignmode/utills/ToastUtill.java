package com.example.administrator.androiddesignmode.utills;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.androiddesignmode.R;

import java.util.List;

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

    public static  void  showChosedialog(Context context, List<String> list){
        // 创建对话框构建器
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        // 获取布局
        LinearLayout view2 = (LinearLayout) View.inflate(context, R.layout.showtext, null);
        // 获取布局中的控件
        final TextView username = (TextView) view2.findViewById(R.id.tv_alterdialog_showtext);
        final Button button = (Button) view2.findViewById(R.id.BT_alterdialog_showtext);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        button.setText("选择ok");
        button.setVisibility(View.GONE);
        // 设置参数
        builder.setTitle("请选择").setIcon(R.drawable.bg_tv_content_main)
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
        showSelect(context,list,view2,alertDialog);
        alertDialog.show();
    }

    private static void showSelect(final Context context, List<String> empty, LinearLayout view2, final AlertDialog alertDialog) {
        if (empty.isEmpty()){
            ToastUtill.showToast(context,"没有选项");
            return;
        }else {
            for (int i = 0; i < empty.size(); i++) {
                LinearLayout item = (LinearLayout) LinearLayout.inflate(context, R.layout.item_select, null);
                RadioButton radioButton  = item.findViewById(R.id.rb_select);
                radioButton.setText(empty.get(i).toString());
                radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if (b){
                            ToastUtill.showToast(context,compoundButton.getText().toString());
                            alertDialog.dismiss();
                        }
                    }
                });
                view2.addView(item);
            }
        }

    }
}
