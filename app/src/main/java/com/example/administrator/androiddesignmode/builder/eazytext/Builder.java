package com.example.administrator.androiddesignmode.builder.eazytext;

/**
 * Created by wxm on 2018/5/22.
 * 卫晓明
 */

public abstract class Builder {
    public abstract void buildBoard(String board);
    public abstract void buildDisplay(String board);
    public abstract void buildOs();
    public abstract Computer create();
}
