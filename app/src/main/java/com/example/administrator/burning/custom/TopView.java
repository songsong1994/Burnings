package com.example.administrator.burning.custom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.example.administrator.burning.R;

/**
 * Created by Administrator on 2017/6/12.
 */

public class TopView extends FrameLayout {
    public TopView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.top_view,this);
    }
}
