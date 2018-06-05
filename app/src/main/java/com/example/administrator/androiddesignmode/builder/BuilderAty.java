package com.example.administrator.androiddesignmode.builder;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.androiddesignmode.R;
import com.example.administrator.androiddesignmode.builder.eazytext.BuilderEazyAty;
import com.example.administrator.androiddesignmode.builder.systembuilder.SystemBuilderAty;
import com.example.administrator.androiddesignmode.utills.ToastUtill;

/*
* 声明： 该模式为复杂对象的创建型模式，允许用户不知道内部构建细节的情况下，更精细的控制对象的构造流程；
* 说白了 就是因为某个类对象太复杂，那么把对象的部件和组装过程分离，我们只需要知道组合大的组件就ok，细想来
* activity 的listview 子页面很复杂的情况下， 新建一个adapter 去做相关操作，暴露方法，有差不多功效；
* 或者说mvp 模式，都是为了解耦，为了逻辑的更清晰
* */
public class BuilderAty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_aty);
        setTitle("Builder 模式");
    }

    public void jumdescription(View view) {
        ToastUtill.showTextdialog(this,"            定义      \n" +
                "将一个复杂对象的构建与它的标示分离，使得同样的构建过程可以创建不同的表示\n" +
                " 使用场景：\n" +
                "1.相同方法，不同执行顺序产生不同的事件结果\n" +
                "2.多个部件和零件，可以装配到一个对象中，但是产生的运行结果不相同时候\n" +
                "3.产品非常复杂，或者产品类中的调用顺序不同产生了不同的作用\n" +
                "4.初识化一个对象非常复杂，比如参数多，且很多参数具有默认值得时候");
    }

    public void jumeasy(View view) {
        startActivity(new Intent(this,BuilderEazyAty.class));
    }

    public void jumsystem(View view) {
        startActivity(new Intent(this,SystemBuilderAty.class));
    }
}
