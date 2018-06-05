package com.example.administrator.androiddesignmode.builder.eazytext;

/**
 * Created by wxm on 2018/5/22.
 * 卫晓明
 */

public class BuilderImp extends Builder {
    private Computer computer = new WindosBook();
    @Override
    public void buildBoard(String board) {
        computer.setBoard(board);
    }

    @Override
    public void buildDisplay(String board) {
        computer.setDisplay(board);
    }

    @Override
    public void buildOs() {
        computer.setOs();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
