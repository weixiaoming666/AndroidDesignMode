package com.example.administrator.androiddesignmode.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.administrator.androiddesignmode.R;
import com.example.administrator.androiddesignmode.utills.ToastUtill;
import com.example.administrator.androiddesignmode.utills.Utill;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

/**
 * Created by wxm on 2018/4/19.
 * 私有的 adapter
 * 适配器的工作是把 data 和 view 粘合起来
 * 所以他需要把 itemView 放到 lv 中；
 * 那么他需要布局填充器  同时需要数据
 */

public abstract class ListViewAdapterBase<T> extends BaseAdapter {
    private String Tag = "ListViewAdapterBase";
    private List<T> datas = new ArrayList<>();
    private  Context context;//继承使用
    private int size=0;//直接new 使用
    private LayoutInflater layoutInflater;
    public ListViewAdapterBase(List<T> datas, Context context) {
        this.datas.addAll(datas);//使用 = 取得引用  不能进行写入操作
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }
    public List<T> getDatas() {
        return datas;
    }
    public ListViewAdapterBase(int size) {//直接new 使用 这种情况下不需要
        this.size = size;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        if (size ==0){
            return datas.size()!=0?datas.size():0;
        }else {
            return size;
        }
    }
    @Override
    public Object getItem(int i) {
        return datas.get(i);//获取单条数据
    }

    @Override
    public long getItemId(int i) {
        return i;//获取位置
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolderBase holder;
        if (view == null){
            view = layoutInflater.inflate(R.layout.item_rlv_mainaty,null);
            holder = setHolder();
            holder.linkXml2View(view);
            view.setTag(holder);
        }else {
           holder = (ViewHolderBase) view.getTag();
        }
        setDatas(holder,i);
        return view;
    }
//    添加一个item 到指定位置
    public void addView(T t,int position){
        datas.add(position,t);
        notifyDataSetChanged();
    }
    //    删除一个位置的item
    public void delView(int position){
        if (datas.size()>position){
            getDatas().remove(position);
            notifyDataSetChanged();
        }else {
            Utill.myLogErr(Tag,"删除的view 不存在");
        }
    }
    public abstract  void setDatas(ViewHolderBase holder, int i);
//    改变某个view 的背景色等
//    public abstract  void setItemBackground(View view);

    public abstract  ViewHolderBase setHolder();

}
