package com.example.administrator.burning;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.administrator.burning.fragment.EventFragment;
import com.example.administrator.burning.fragment.HomeFragment;
import com.example.administrator.burning.requestdata.APP;
import com.example.administrator.burning.beans.History;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, Callback<History> {

    private RadioGroup group;
    private TextView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (TextView) findViewById(R.id.main_text);
        group = (RadioGroup) findViewById(R.id.layout_main);
        group.setOnCheckedChangeListener(this);
        APP app = (APP) getApplication();
        app.getServer().gethistory().enqueue(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (checkedId) {
            case R.id.activity:
                transaction.replace(R.id.layout_for_fragment,new EventFragment());
                break;
            case R.id.my:
                break;
            case R.id.burning:
                transaction.replace(R.id.layout_for_fragment,new HomeFragment());
                break;
        }
        transaction.commit();
    }

    @Override
    public void onResponse(Call<History> call, Response<History> response) {
        //int totalCount = response.body().getData().getTotalCount();
        view.setText(response.body().getData().getList().get(0).getPhoto().getUrl().toString());
    }

    @Override
    public void onFailure(Call<History> call, Throwable t) {
        t.printStackTrace();

    }


//    @Override
//    public void onClick(View v) {
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        switch (v.getId()) {
//            case R.id.activity:
//                break;
//            case R.id.my:
//                break;
//            case R.id.burning:
//                transaction.replace(R.id.layout_for_fragment,new HomeFragment());
//                break;
//        }
//        transaction.commit();
//    }
}
