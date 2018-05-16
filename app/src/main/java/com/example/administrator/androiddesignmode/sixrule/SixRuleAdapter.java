package com.example.administrator.androiddesignmode.sixrule;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.androiddesignmode.R;
import com.example.administrator.androiddesignmode.base.ListViewAdapterBase;
import com.example.administrator.androiddesignmode.base.ViewHolderBase;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19.
 */

public class SixRuleAdapter extends ListViewAdapterBase<String> {
    public SixRuleAdapter(List<String> datas, Context context) {
        super(datas, context);
    }
    @Override
    public void setDatas(ViewHolderBase holder, int position) {
       TextView  textView = (TextView)holder.view1;
        textView.setText(getDatas().get(position));
    }
    @Override
    public ViewHolderBase setHolder() {
        ViewHolderBase holderBase = new ViewHolderBase() {
            @Override
            public void linkXml2View(View contentView) {
                view1 = contentView.findViewById(R.id.tv_item_main_rlv_content);
            }
        };
        return holderBase;
    }
}
