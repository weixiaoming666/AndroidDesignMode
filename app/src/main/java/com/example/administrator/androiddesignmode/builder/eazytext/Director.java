package com.example.administrator.androiddesignmode.builder.eazytext;

/**
 * Created by wxm on 2018/5/22.
 * 卫晓明
 * 负责构造 computer
 * GOF 所谓经典模式
 */

public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void  construct(String board,String display){
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOs();
    };
}
