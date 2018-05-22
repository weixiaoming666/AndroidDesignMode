package com.example.administrator.androiddesignmode.singleton;

import android.app.NotificationManager;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

import com.example.administrator.androiddesignmode.R;
import com.example.administrator.androiddesignmode.utills.ToastUtill;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
/*
*单例模式的总结
* 核心是构造方法私有；实例静态私有；实例要确保整个app有且只有一个；
* 暴露静态的共有方法去取得实例；
* 各种方式不同：
* 饿汉模式：直接在声明阶段 赋值引用；
* 懒汉模式：方法调用阶段赋值引用，同步在方法阶段;
*   DCL模式：同步在方法内部且在引用为空的情况下；  DCL失效问题，单例实例化的时候 调用构造函数和声明指向对象 原子操作顺序不定 很难重现
*   枚举模式：本身自带同步，无反序列化钩子函数问题   推介
*   静态内部类：通过静态内部类拿到类的引用；（静态内部类只能调用外部类的静态成员和方法，因为是静态 所以是在构造阶段）
*   容器实现单例：静态map中 暴露 注册 和 获取 静态方法
*   声明：DCL失效，先做了指引用的情况下，别的地方调用单例，会获取到一个null 导致问题；偶现难跟踪；
* */
public class SingletonAty extends AppCompatActivity {
    LayoutInflater layoutInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_aty);
        setTitle("单例模式");

    }

    public void layoutInflater(View view) {
//            布局填充着 layoutInflater
        layoutInflater = LayoutInflater.from(this);//通过上下文拿到引用
//        内部实现为： 通过 name 获取相应的系统服务 Context 为抽象类 其实就是配置类
//        所以一个app 中 有   aty+service+1 个Context 实例
//        content 的实现类 contextImpl 通过 创建 HashMap 键值对的形式存储 各种服务 和key
//        LayoutInflater 静态代码的形式生成一次,存入 map 中, 暴露方法如下 获取该服务
//        这里  layoutInflater 是通过
        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater = getLayoutInflater();//直接有这个方法返回了
        ToastUtill.showTextdialog(this," 内部实现为： 通过 name 获取相应的系统服务 Context 为抽象类 其实就是配置类" +
                "所以一个app 中 有   aty+service+1 个Context 实例" +
                "content 的实现类 contextImpl 通过 创建 HashMap 键值对的形式存储 各种服务 和key" +
                "  LayoutInflater 静态代码的形式生成一次,存入 map 中, 暴露方法如下 获取该服务" +
                "   layoutInflater.inflate(viewid，parentView)； 普遍应用这个方法传入视图" +
                "  这个方法依次调用了下面方法；" +
                " layoutInflater.inflate(viewid，parentView，attachToRoot)；" +
                " inflate(xmlparser，parentView，attachToRoot)；" +
                " xmlparser 通过深度遍历构造视图树 CreatViewFromTag（...）构造单个元素view；" +
                "  rInflater（...）构造整个视图树； ok");


//        layoutInflater.inflate(viewid，parentView)； 普遍应用这个方法传入视图
//         这个方法依次调用了下面方法；
//      layoutInflater.inflate(viewid，parentView，attachToRoot)；
//        inflate(xmlparser，parentView，attachToRoot)；
//           xmlparser 通过深度遍历构造视图树 CreatViewFromTag（...）构造单个元素view；
//        rInflater（...）构造整个视图树； ok

    }
//   所谓单例 只是暴露出了一个取的某个类实例的唯一方法，且方法内部保证了实例的唯一性；
    public void jumpenum(View view) {//枚举 推介
        SingletonEnum.INSTANCE.dosomething(this);
    }

    public void jumplazy(View view) {//懒汉模式    饿汉模式没写 ez
        LazySingleton.getInstance().dosomething(this);
    }

    public void jumstatic(View view) {// 单例模式
        SingletonStatic.getInstance().dosomething(this);
    }

    public void jummapManager(View view) {
        String [] names = {"单例模式","饿汉模式","懒汉模式","dcl双锁模式","静态模式","枚举模式","map模式"};
        List<String> strings = Arrays.asList(names);
        ToastUtill.showChosedialog(this,strings);
//        SingetonManager.registerServer("enum",SingletonEnum.INSTANCE);
//        SingletonEnum singletonEnum = (SingletonEnum) SingetonManager.getService("enum");
//        singletonEnum.dosomething(this);
    }

    public void jumdescription(View view) {
        ToastUtill.showTextdialog(this,     "单例模式的总结:\n" +
                "核心是构造方法私有；实例静态私有；实例要确保整个app有且只有一个；\n" +
                "暴露静态的共有方法去取得实例；\n" +
                " 各种方式不同：\n" +
                "1.饿汉模式：直接在声明阶段 赋值引用；\n" +
                "2.懒汉模式：方法调用阶段赋值引用，同步在方法阶段;\n" +
                "3.DCL模式：同步在方法内部且在引用为空的情况下；  DCL失效问题，单例实例化的时候 调用构造函数和声明指向对象 原子操作顺序不定 很难重现\n" +
                "4.枚举模式：本身自带同步，无反序列化钩子函数问题   推介\n" +
                "5.静态内部类：通过静态内部类拿到类的引用；（静态内部类只能调用外部类的静态成员和方法，因为是静态 所以是在构造阶段）\n" +
                "6.容器实现单例：静态map中 暴露 注册 和 获取 静态方法\n" +
                "声明：DCL失效，先做了指引用的情况下，别的地方调用单例，会获取到一个null 导致问题；偶现难跟踪；");
    }
}
