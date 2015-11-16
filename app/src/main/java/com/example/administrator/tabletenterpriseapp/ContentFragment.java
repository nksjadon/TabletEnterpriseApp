package com.example.administrator.tabletenterpriseapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Administrator on 10/13/2015.
 */
public class ContentFragment extends Fragment {
    TextView tv;
    String message;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.content_fragment,container,false);


        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv=(TextView)getActivity().findViewById(R.id.contentFragmentText);
    }

    public String getData(String message){

        tv.setText(message);

        return message;
    }


}
