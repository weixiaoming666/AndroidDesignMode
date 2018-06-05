package com.example.administrator.androiddesignmode.builder.systembuilder;

import android.os.HandlerThread;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.administrator.androiddesignmode.R;
import com.example.administrator.androiddesignmode.utills.ToastUtill;
//https://blog.csdn.net/carson_ho/article/details/51472640 entries 不能配合自定义view使用
public class SystemBuilderAty extends AppCompatActivity {
    private ListViewCompat listViewCompat;
    private ListAdapter listAdapter;
    private TextView layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_adapter);
        listViewCompat = (ListViewCompat) findViewById(R.id.lv_systembuilder);
        layout = (TextView) findViewById(R.id.textView3);
        listAdapter  = listViewCompat.getAdapter();
        setLister();

    }

    private void setLister() {
        listViewCompat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                view.setVisibility(View.GONE);
                TextView layout = (TextView) view;
//                layout.setGravity(Gravity.CENTER);
                ToastUtill.showToast(SystemBuilderAty.this,i+"");
            }
        });

//        android.R.layout.simple_list_item_1;
//        ListAdapter listAdapter  = listViewCompat.getAdapter();
//        int s = listAdapter.getCount();
//        int s1 = listAdapter.getCount();
    }

    public void changes(View view) {
        for (int j = 0; j <listAdapter.getCount(); j++) {
            ((TextView)listAdapter.getView(j,listViewCompat.getChildAt(j),listViewCompat)).setGravity(Gravity.CENTER);
        }//点击才能居中 直接做操作是不行的 ，是因为布局冲突？以后再找原因
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (int j = 0; j <listAdapter.getCount(); j++) {
            ((TextView)listAdapter.getView(j,listViewCompat.getChildAt(j),listViewCompat)).setGravity(Gravity.CENTER);
        }// 以后解决  看源码吧
    }
}
