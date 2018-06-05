package com.example.administrator.androiddesignmode.builder.eazytext;

/**
 * Created by wxm on 2018/5/22.
 * 卫晓明
 * 链式调用的实现
 * 更加的简单可爱
 */

public class BuilderPCS  {
    private Computer computer = new WindosBook();
    public BuilderPCS buildBoard(String board) {
        computer.setBoard(board);
        return this;
    }
    public BuilderPCS buildDisplay(String display) {
        computer.setDisplay(display);
        return this;
    }

    public BuilderPCS buildOs() {
        computer.setOs();
        return this;
    }

    public Computer create() {
        return computer;
    }
}
