package com.example.administrator.androiddesignmode.sixrule;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.example.administrator.androiddesignmode.R;
import com.example.administrator.androiddesignmode.utills.ToastUtill;
import com.example.administrator.androiddesignmode.utills.Utill;

import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.List;

//六大原则 这里采用基本的布局
public class SixRuleActivity extends AppCompatActivity {
    private String[] strings = {"单一职责","开闭原则","里式替换","依赖倒置","接口隔离","迪米特法则"};
    private List<String> datas;
    private ListView listView;
    private SixRuleAdapter sixRuleAdapter;
    private View header;
    private View foot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_rule);
        setTitle("六大原则");
        if (Build.VERSION.SDK_INT >= 21) {//所谓沉浸式状态栏
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        datas = Arrays.asList(strings);
        sixRuleAdapter = new SixRuleAdapter(datas,this);
        listView = (ListView) findViewById(R.id.lv_six_rule_aty);
        listView.setAdapter(sixRuleAdapter);
         header = LayoutInflater.from(this).inflate(R.layout.header_lv_six_rule_aty,null);//头视图
//        其实   xlistview  不外乎就是自定义了一个头视图和尾视图而已  并且做了一个监听
         foot = LayoutInflater.from(this).inflate(R.layout.footer_lv_six_rule_aty,null);//尾巴视图
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtill.showToast(SixRuleActivity.this,"我是头哦");
            }
        });
        foot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastUtill.showToast(SixRuleActivity.this,"我是尾巴");
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ToastUtill.showToast(SixRuleActivity.this,"我是身体"+i);
                String msg ="";
                switch (i){
                    case 0:
                        break;
                    case 1:
//                        单一职责原则：对于一个类而言，应该仅有一个引起它变化的原因
                        /*
                        * 每一个类都只应该去做一个专一的业务或者事情，业务功能过多 容易导致混乱，一个类中应该是一组相关性很高的函数，数据的封装
                        * 关键点在于定义 什么是类的职责，怎么划分类的职责；
                        * */
                        msg = " 单一职责原则，每一个类都只应该去做一个专一的业务或者事情，业务功能过多 容易导致混乱，一个类中应该是一组相关性很高的函数，数据的封装" +
                                "关键点在于定义 什么是类的职责，怎么划分类的职责";
                        ToastUtill.showTextdialog(SixRuleActivity.this,msg);
                        break;
                    case 2:
//                  开闭原则
                        msg = "OPG开闭原则，对于扩展是开放的，对于修改是封闭的，原因是项目ok的情况下，修改可能引入莫名其妙的bug等，并且，牵一发二动全身" +
                                "，但是通过扩展继承完全能很好的解决这个问题。这只是理想情况，项目很小，修改代价很小情况下，也是可以修改的";
                        ToastUtill.showTextdialog(SixRuleActivity.this,msg);
                        break;
                    case 3:
//                          里式替换原则： 所有引用基类的地方都能够透明的使用其子类的对象
                        /*
                        * 核心在于抽象，java的三大特性  继承封装多态的诠释，该原则依赖于继承和多态；因为继承，子类拥有基类所有的方法，所以替换功能不会受到影响；并且不同的子类
                        * 可以有不同的函数处理表现出不同的能力 酸辣味的方便面和酸菜味道的方便面在于调料的不同
                        * */
                        msg = "  里式替换原则，核心在于抽象，java的三大特性  继承封装多态的诠释，该原则依赖于继承和多态；因为继承，子类拥有基类所有的方法，所以替换功能不会受到影响；并且不同的子类" +
                                "可以有不同的函数处理表现出不同的能力 酸辣味的方便面和酸菜味道的方便面在于调料的不同";
                        ToastUtill.showTextdialog(SixRuleActivity.this,msg);
                        break;
                    case 4:
                        //                        依赖倒置原则
                        msg = "  DIP依赖倒置原则,一种特定解偶方式，高层次模块不依赖于低层次模块的实现细节，就是说抽象不依赖于细节，细节依赖抽象" +
                                ",高层次模块和低层次模块都应该依赖低层次模块的抽象" +
                                ",说的直接点就是模块之间的调用等关系通过抽象发生，实现类之间不存在依赖关系，这样便于解耦";
                        ToastUtill.showTextdialog(SixRuleActivity.this,msg);
                        break;
                    case 5:
//                        接口隔离原则
                        msg = "  ISP接口隔离原则，细分依赖的抽象接口，使之尽可能小，方便解耦，重构等" +
                                "，就是把依赖的类等尽量小而且精致00";
                        ToastUtill.showTextdialog(SixRuleActivity.this,msg);
                        break;
                    case 6:
                        //                        迪米特法则
                        msg = "  LOD,迪米特法则，一个对象应该对其他对象了解是最少的，说白了就是java 的封装，知道的越多" +
                                "，耦合就会越严重";
                        ToastUtill.showTextdialog(SixRuleActivity.this,msg);
                        break;


                }

            }
        });
        listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ToastUtill.showToast(SixRuleActivity.this,"我是被选中的少年哦"+i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        listView.addFooterView(foot);
        listView.addHeaderView(header);

//        listView.setEmptyView();无数据视图

    }

    public void addListView(View view) {
        View view1 = LayoutInflater.from(this).inflate(R.layout.item_rlv_mainaty,null);
                        view1.getLayoutParams();
//        listView.addView(view1,view1.getLayoutParams()); 很明显本身并没有这些方法 那么这里做一个选择的话是去改变adapter
        sixRuleAdapter.addView("增加的aty",2);
    }

    public void delListView(View view) {
        sixRuleAdapter.delView(2);
    }
}
