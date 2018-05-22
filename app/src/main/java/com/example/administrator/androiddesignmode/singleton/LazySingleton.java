package com.example.administrator.androiddesignmode.singleton;

import android.content.Context;

import com.example.administrator.androiddesignmode.utills.ToastUtill;

/**
 * Created by wxm on 2018/5/21.
 * 卫晓明
 * 懒汉模式
 * synchronized 多线程情况下保证单例的唯一性
 * 优点每次只有使用的时候才会去实例化，一定程度上节约资源；
 * 缺点：第一次加载需要及时进行实例化，耗时；且每次调用getInstance 都会进行同步，造成不必要的开销；
 * https://www.jianshu.com/p/d53bf830fa09
 */

public class LazySingleton {
    private  static  LazySingleton instance;
    private LazySingleton(){};//私有方法是为了 隐藏方法；
        public static synchronized  LazySingleton getInstance(){
     if (instance == null){
         instance = new LazySingleton();
     }
     return instance;
    }
    public void dosomething(Context context){
        ToastUtill.showToast(context,"我是饿汉单例");
        ToastUtill.showTextdialog(context,"优点每次只有使用的时候才会去实例化，一定程度上节约资源；,第一次加载需要及时进行实例化，耗时；且每次调用getInstance 都会进行同步，造成不必要的开销");
    }
}
