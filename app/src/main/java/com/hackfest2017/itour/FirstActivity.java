package com.hackfest2017.itour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FirstActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity);
        listView = (ListView) findViewById(R.id.List1);
        String Items[] = new String[]{"Rupesh","Manoj","Rishikesh"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(FirstActivity.this,android.R.layout.simple_list_item_1,Items);
        listView.setAdapter(adapter);
    }



}
