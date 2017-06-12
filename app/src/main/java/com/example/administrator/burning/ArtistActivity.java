package com.example.administrator.burning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.administrator.burning.adapter.ArtistAdapter;
import com.example.administrator.burning.custom.ArtistTopView;

public class ArtistActivity extends AppCompatActivity {
    private ListView listView;
    private ArtistAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        listView = (ListView) findViewById(R.id.artist_listview);
        listView.addHeaderView(new ArtistTopView(ArtistActivity.this));

    }

}
