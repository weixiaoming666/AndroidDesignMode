package com.example.administrator.androiddesignmode.singleton;

/**
 * Created by wxm on 2018/5/21.
 * 卫晓明
 *区别于饿汉模式的点在于同步字段加在了方法内部 且第一次判空避免了不必要的同步；
 * 优点：使用效率高，第一次使用单例才会实例化对象；
 * 缺点： 第一次加载反应较慢，高并发环境下或者低于jdk1.6 的版本使用一定缺陷，因为java内存模型问题 偶尔会失败
 */

public class DCLSingleton {
    //jdk 1.5 之后volatile 解决DCL 失效的问题；
    private volatile static DCLSingleton  singleton = null;
    private DCLSingleton(){};
    public void  dosomesthing(){}
    public static  DCLSingleton getSingleton(){
        if (singleton == null){
            synchronized (DCLSingleton.class){
                if (singleton == null){
                    singleton = new DCLSingleton();
                }
            }
        }
        return  singleton;
    }

}
