package com.example.administrator.tabletenterpriseapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 10/13/2015.
 */
public class SubContentFragment extends Fragment {
    TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.subcontent_fragment,container,false);
        tv=(TextView)v.findViewById(R.id.subContentFragmentText);
        return v;
    }
    public void getData(String message){
        tv.setText(message);
    }
}
