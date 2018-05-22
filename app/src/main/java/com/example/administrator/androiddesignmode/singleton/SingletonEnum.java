package com.example.administrator.androiddesignmode.singleton;

import android.content.Context;

import com.example.administrator.androiddesignmode.utills.ToastUtill;

/**
 * Created by wxm on 2018/5/21.
 * 卫晓明
 * 枚举的单例  枚举的实例创建时线程安全的，其余的在反序列化的时候重新生成对象
 * 需要在钩子函数中进行处理readResolve（）；
 */

public enum SingletonEnum {
    INSTANCE;
    public void dosomething(Context context){
        ToastUtill.showToast(context,"我是枚举单例");
        ToastUtill.showTextdialog(context,"枚举的单例  枚举的实例创建时线程安全的，其余的在反序列化的时候重新生成对象" +
                "需要在钩子函数中进行处理readResolve（）");
    }

}
