package com.example.administrator.androiddesignmode.base;

import android.view.View;

/**
 * Created by wxm on 2018/4/19.
 * 用在作为父类去让子类应用
 */

public abstract class ViewHolderBase {
    public View contentView,view1,view2,view3,view4,view5,view6,view7,view8;
    public abstract void linkXml2View(View contentView);
}
