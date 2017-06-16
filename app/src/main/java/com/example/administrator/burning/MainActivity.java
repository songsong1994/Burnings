package com.example.administrator.burning;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.example.administrator.burning.fragment.EventFragment;
import com.example.administrator.burning.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup group;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        group = (RadioGroup) findViewById(R.id.layout_main);
        group.setOnCheckedChangeListener(this);
        group = (RadioGroup) findViewById(R.id.layout_main);
        group.setOnCheckedChangeListener(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.layout_for_fragment,new HomeFragment()).commit();
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
