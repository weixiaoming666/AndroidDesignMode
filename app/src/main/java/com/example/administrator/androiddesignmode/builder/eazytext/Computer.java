package com.example.administrator.androiddesignmode.builder.eazytext;

/**
 * Created by wxm on 2018/5/22.
 * 卫晓明
 */

public  abstract class Computer {
//    暂时主机 操作系统 显示器
    private String board;
    private String display;
    protected String os;

    public Computer() {
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
    abstract void setOs();

    @Override
    public String toString() {
        return "电脑参数：\n" +
                "主机：'" + board + '\n' +
                ", 屏幕：'" + display + '\n' +
                ", 操作系统：'" + os + '\n'
                ;
    }


}
