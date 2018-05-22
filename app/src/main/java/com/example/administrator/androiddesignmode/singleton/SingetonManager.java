package com.example.administrator.androiddesignmode.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxm on 2018/5/21.
 * 卫晓明
 * 容器实现单例  存单类 取单例
 */

public class SingetonManager {
    private  static Map<String,Object> objectMap = new HashMap<String, Object>();
    private SingetonManager(){}
    public  static  void  registerServer(String key,Object instance){
        if (!objectMap.containsKey(key)){
            objectMap.put(key,instance);
        }
    }
    public static  Object getService(String key){
        return objectMap.get(key);
    }
}
