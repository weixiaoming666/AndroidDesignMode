package com.example.administrator.androiddesignmode;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.androiddesignmode.abstractfactory.AbstractFactory;
import com.example.administrator.androiddesignmode.adapterpattern.AdapterAty;
import com.example.administrator.androiddesignmode.agent.AgentAty;
import com.example.administrator.androiddesignmode.base.RLVAdapterBase;
import com.example.administrator.androiddesignmode.bridge.BridgeAty;
import com.example.administrator.androiddesignmode.builder.BuilderAty;
import com.example.administrator.androiddesignmode.chainofresponsibility.ChainOfResponsibilityAty;
import com.example.administrator.androiddesignmode.command.CommandAty;
import com.example.administrator.androiddesignmode.composite.CompositeAty;
import com.example.administrator.androiddesignmode.decorator.DecoratorAty;
import com.example.administrator.androiddesignmode.facade.FacadeAty;
import com.example.administrator.androiddesignmode.factorymethod.FactoryMethodAty;
import com.example.administrator.androiddesignmode.flyweight.FlyweightAty;
import com.example.administrator.androiddesignmode.interpreter.InterpreterAty;
import com.example.administrator.androiddesignmode.iterator.IteratorAty;
import com.example.administrator.androiddesignmode.mediator.MediatorAty;
import com.example.administrator.androiddesignmode.memento.MementoAty;
import com.example.administrator.androiddesignmode.observer.ObserverAty;
import com.example.administrator.androiddesignmode.prototype.PrototypeAty;
import com.example.administrator.androiddesignmode.singleton.SingletonAty;
import com.example.administrator.androiddesignmode.sixrule.SixRuleActivity;
import com.example.administrator.androiddesignmode.state.StateAty;
import com.example.administrator.androiddesignmode.strategy.StrategyAty;
import com.example.administrator.androiddesignmode.template.TemplateAty;
import com.example.administrator.androiddesignmode.utills.ToastUtill;
import com.example.administrator.androiddesignmode.utills.Utill;
import com.example.administrator.androiddesignmode.visitor.VisitorAty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FloatingActionButton floatingActionButton;
    private ViewHolder holder;
    List<String> datas;
    List<PatternEntuty> entuties;
    private String[] stringsData = {"六大原则","单例模式","Builder模式","原型模式","工厂方法模式",
    "抽象工厂模式","策略模式","状态模式","责任链模式","解释器模式","命令模式","观察者模式","备忘录模式",
            "迭代器模式","模板方法模式","访问者模式","中介者模式","代理模式","组合模式","适配器模式","装饰模式",
            "享元模式","桥接模式","外观模式"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("设计模式目录");
        initView();
        initData();
        setListenter();
    }

    private void initData() {//跳转信息封装的entity 里面  业务逻辑更清晰
        entuties = new ArrayList<>();
        for (int i = 0; i < datas.size(); i++) {
            PatternEntuty patternEntuty = new PatternEntuty();
            patternEntuty.name = datas.get(i);
            entuties.add(i,patternEntuty);
        }
        getEntitys(entuties);

    }



    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.rlv_main_aty);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        datas = Arrays.asList(stringsData);
        //直接使用baseAdapter 暴露操作 粘合ui和数据的方法 根据情况进行变换  也可以写一个类去继承base 然后在该类中操作（
        // 业务逻辑比较多的时候）


    }
    private int anInt =1;//用来切换模式的按钮
//    切换视图中前五个变化延迟 是因为没有刷新界面 复用问题
    private void setListenter() {//监听变化
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (anInt){
                    case 0://线性流
                        ((RLVAdapterBase) recyclerView.getAdapter()).setLayout(R.layout.item_rlv_mainaty);
                        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        anInt = 1;
                        break;
                    case 1://卡片流
                        ((RLVAdapterBase) recyclerView.getAdapter()).setLayout(R.layout.item_rlv_main_aty_cardview);
                        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
                        anInt =2;
                        break;
                    case 2://瀑布流
                        ((RLVAdapterBase) recyclerView.getAdapter()).setLayout(R.layout.item_rlv_main_aty_staggere);
                        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,OrientationHelper.VERTICAL));
                        anInt =0;
                        break;
                }
            }
        });


    }

    //内部类 可以直接创建一个外部类   也可以在adapter 中直接创建内部类
  public static class ViewHolder extends RecyclerView.ViewHolder{

       public TextView tv_content;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_content = itemView.findViewById(R.id.tv_item_main_rlv_content);
        }
        public void setTvContent(String content){
            tv_content.setText(content);
        }
    }




    private void getEntitys(final List<PatternEntuty> entuties) {
        entuties.get(0).type = SixRuleActivity.class;//六大原则
        entuties.get(1).type = SingletonAty.class;//单例模式
        entuties.get(2).type = BuilderAty.class;//build 模式
        entuties.get(3).type = PrototypeAty.class;//原型模式
        entuties.get(4).type = FactoryMethodAty.class;
        entuties.get(5).type = AbstractFactory.class;
        entuties.get(6).type = StrategyAty.class;//策略模式
        entuties.get(7).type = StateAty.class;//状态模式
        entuties.get(8).type = ChainOfResponsibilityAty.class;//责任链模式
        entuties.get(9).type = InterpreterAty.class;//解释器模式
        entuties.get(10).type = CommandAty.class;//命令模式
        entuties.get(11).type = ObserverAty.class;//观察者模式
        entuties.get(12).type = MementoAty.class;//备忘录模式
        entuties.get(13).type = IteratorAty.class;//迭代器模式
        entuties.get(14).type = TemplateAty.class;//模板方法模式
        entuties.get(15).type = VisitorAty.class;//访问者模式
        entuties.get(16).type = MediatorAty.class;//中介者模式
        entuties.get(17).type = AgentAty.class;//代理模式
        entuties.get(18).type = CompositeAty.class;//组合模式
        entuties.get(19).type = AdapterAty.class;//适配器模式
        entuties.get(20).type = DecoratorAty.class;//装饰模式
        entuties.get(21).type = FlyweightAty.class;//享元模式
        entuties.get(22).type = BridgeAty.class;//桥接模式
        entuties.get(23).type = FacadeAty.class;//外观模式

        recyclerView.setAdapter(new RLVAdapterBase(entuties,this) {
            //其实这里只需要传递一个datas的大小就可以 如果在aty 中处理的话
            //也可以做一个接口回调 处理无数据的时候的状态
            @Override
            public void linkData2View(final RecyclerView.ViewHolder holder, final int position) {
                ((ViewHolder) holder).setTvContent(datas.get(position));
//                单个item的点击监听 可以接口回调来做 看逻辑的复杂性
                ((ViewHolder) holder).tv_content.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ToastUtill.showToast(MainActivity.this,holder.getPosition()+"位置");
                        Utill.jump2NewAty(MainActivity.this,entuties.get(position).type);

                    }
                });
            }
        });


    }

}
