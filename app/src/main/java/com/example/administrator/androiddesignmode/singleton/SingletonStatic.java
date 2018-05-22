package com.example.administrator.androiddesignmode.singleton;

import android.content.Context;

import com.example.administrator.androiddesignmode.utills.ToastUtill;

/**
 * Created by wxm on 2018/5/21.
 * 卫晓明
 * 静态内部类 单例
 * 第一次加载类的时候不会初始化 instance；只有第一次调用getInstance 才会初始化 确保线程安全保证单例的唯一性
 */

public class SingletonStatic {
    private SingletonStatic(){}
    public static  SingletonStatic getInstance(){
        return SingletonHolder.SINGLETON_STATIC;
    }

//    静态内部类
    private  static class SingletonHolder{
    private  static  final SingletonStatic SINGLETON_STATIC = new SingletonStatic();

}

    public void dosomething(Context context){
        ToastUtill.showToast(context,"我是静态单例");
        ToastUtill.showTextdialog(context,"第一次加载类的时候不会初始化 instance；只有第一次调用getInstance 才会初始化 确保线程安全保证单例的唯一性，推介写法");
    }
}

