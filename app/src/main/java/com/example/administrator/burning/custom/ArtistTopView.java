package com.example.administrator.burning.custom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.example.administrator.burning.R;

public class ArtistTopView extends FrameLayout {

    public ArtistTopView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.top_artist_view,this);

    }
}
