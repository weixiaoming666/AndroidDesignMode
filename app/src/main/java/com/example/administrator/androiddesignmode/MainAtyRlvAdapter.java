package com.example.administrator.androiddesignmode;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.administrator.androiddesignmode.base.RLVAdapterBase;

import java.util.List;

/**
 * Created by Administrator on 2018/4/18.
 */

public class MainAtyRlvAdapter extends RLVAdapterBase<String> {
    public MainAtyRlvAdapter(List<String> datas, Context view) {
        super( datas, view);
    }
    @Override
    public void linkData2View(RecyclerView.ViewHolder holder, int position) {

        MainActivity.ViewHolder holder1 = (MainActivity.ViewHolder) holder;
        String s = getData().get(position)+"";
        ((MainActivity.ViewHolder) holder).setTvContent(getData().get(position)+"");
    }
}
