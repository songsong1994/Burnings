package com.example.administrator.burning.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.administrator.burning.ArtistActivity;
import com.example.administrator.burning.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {
private Button bt1,event_city_but;

    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bt1= (Button) view.findViewById(R.id.event_past_but);
        event_city_but = (Button) view.findViewById(R.id.event_city_but);
        event_city_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ArtistActivity.class);
                intent.putExtra("userId","14d40841126e395e");
                startActivity(intent);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.event_fragment_id,new PastFragment());
                transaction.commit();
            }
        });

    }

}
