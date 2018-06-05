package com.example.administrator.androiddesignmode.builder.eazytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.androiddesignmode.R;

public class BuilderEazyAty extends AppCompatActivity {
    private  Director director;
    private BuilderPCS builderPCS = new BuilderPCS();
    private TextView tv_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder_eazy_aty);
        setTitle("简单的builder测试，电脑为例");
        tv_show = (TextView) findViewById(R.id.tv_show);

    }

    public void pcs(View view) {
        Computer computer = builderPCS.buildBoard("windos core 超级cpu").buildDisplay("华为自主研制柔性媲美航母的屏幕")
                .buildOs().create();
        tv_show.setText("链式创建，在于builder 直接返回自己的引用,推介使用\n"+computer.toString());
    }

    public void direction(View view) {
        director = new Director(new BuilderImp());
        director.construct("苹果第十代cpu","无敌大猩猩钢化屏幕");
        Computer computer = director.builder.create();
        tv_show.setText("构造一个新的产品类，通过暴露方法去创建\n"+computer.toString());
    }
}
