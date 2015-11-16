package com.example.administrator.tabletenterpriseapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.zip.Inflater;

/**
 * Created by Administrator on 10/13/2015.
 */
public class ListFragment extends Fragment {
    SendMessage sendMessage;
    String listData;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {


        View v= inflater.inflate(R.layout.list_fragment,container,false);


        //Creating list on fragment
        String[] str={"Hockey","Football","Cricket","Badminton","Tennis","Chess","Basketball","Air Hockey","Ice Skating","Table Tennis"};




        ListView fragmentListView = (ListView)v.findViewById(R.id.listView);

        ListAdapter listAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,str);

        //AdapterClass listAdapter = new AdapterClass(getActivity(),str);

        fragmentListView.setAdapter(listAdapter);



        fragmentListView.setOnItemClickListener(

                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        listData = String.valueOf(parent.getItemAtPosition(position));

                        sendMessage.sendData(listData);


                    }
                }


        );



        return v;

    }


    interface SendMessage{

        void sendData(String message);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            sendMessage = (SendMessage) activity;
        }
        catch (Exception e){

        }
    }
}

/*
class AdapterClass extends ArrayAdapter<String>{
    Context context;
    String[] titleArray;
    //String[] descArray;


    public AdapterClass(Context context,String[] title) {
        super(context, R.layout.single_row_view);

        this.context=context;
        this.titleArray=title;
        //this.descArray=desc;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row_view,parent,false);

        TextView titles = (TextView)row.findViewById(R.id.defaultTiltle);
        titles.setText(titleArray[position]);

        TextView description =(TextView)row.findViewById(R.id.defaultDescription);
        //description.setText(descArray[position]);


        return row;

    }
}
*/
