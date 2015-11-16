package com.example.administrator.tabletenterpriseapp;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ListFragment.SendMessage{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        ListFragment list = new ListFragment();
        ContentFragment content = new ContentFragment();
        SubContentFragment subContent = new SubContentFragment();
        fragmentTransaction.replace(R.id.contentFragment, content);
        fragmentTransaction.replace(R.id.listFragment, list);
        fragmentTransaction.replace(R.id.subContentFragment, subContent);

        fragmentTransaction.commit();

    }


    @Override
    public void sendData(String message) {

        ContentFragment contentFragment=(ContentFragment)getFragmentManager().findFragmentById(R.id.contentFragment);
        contentFragment.getData(message);


        SubContentFragment subContentFragment = (SubContentFragment) getFragmentManager().findFragmentById(R.id.subContentFragment);
        subContentFragment.getData(message);

    }


}
