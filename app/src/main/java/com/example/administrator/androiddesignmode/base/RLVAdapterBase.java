package com.example.administrator.androiddesignmode.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.androiddesignmode.MainActivity;
import com.example.administrator.androiddesignmode.R;
import com.example.administrator.androiddesignmode.utills.ToastUtill;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.zip.CheckedOutputStream;

/**
 * Created by WXM on 2018/4/18.
 * 新建baseRecycleView Adapter 万能用法
 */

public abstract class RLVAdapterBase<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//    这里可以构造传参数 ，也可以 set传
    private  RecyclerView.ViewHolder holder;
    private List<T> datas;
    private Context context;
    private ArrayList<Integer> mHeights;//瀑布流高度
    //构造获取数据
    public RLVAdapterBase(List datas, Context context) {
        this.datas = datas;
        this.context = context;
    }
    @Override
//    创造viewholder 就是item
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View newView =  LayoutInflater.from(context).inflate(s,parent,false);
        MainActivity.ViewHolder viewHolder = new MainActivity.ViewHolder(newView);
        return  viewHolder;
    }
//    数据和view相同
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MainActivity.ViewHolder viewHolder = (MainActivity.ViewHolder) holder;
        if (s == R.layout.item_rlv_main_aty_staggere){
            //瀑布流
            ViewGroup.LayoutParams lp = viewHolder.tv_content.getLayoutParams();
            lp.height = mHeights.get(position);
        }else {
            ViewGroup.LayoutParams lp = viewHolder.tv_content.getLayoutParams();
            lp.height = 100;
        }
            linkData2View(holder,position);//回调父类方法
    }
    //获取data item数量
    @Override
    public int getItemCount() {
        return datas.size()>0?datas.size():6;
    }
    //获取数据
    public List<T> getData(){
        return datas;
    }
    private int  s = R.layout.item_rlv_mainaty;//瀑布流id
    //更换布局
    public void setLayout(int s){
        this.s = s;
        if (s == R.layout.item_rlv_main_aty_staggere){
            mHeights = new ArrayList<Integer>();
            for (int i = 0; i < datas.size(); i++) {
                mHeights.add((int) (100 + Math.random() * 300));
            }
        }
        notifyDataSetChanged();
    }
    public abstract void linkData2View(RecyclerView.ViewHolder holder, int position);//暴露出来给当前aty 处理数据



}
