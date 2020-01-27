package com.chumpik.jdmapp.nissan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

import com.chumpik.jdmapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NissanModels extends AppCompatActivity implements View.OnClickListener {

    Button ALSI_1;
    Button ALSI_2;
    Button R34;

    String[] groups = new String[] {"Skyline"};

    String[] Skyline = new String[] {"ALSI-1", "ALSI-2", "R33", "R34"};

    ArrayList<Map<String, String>> groupData;

    ArrayList<Map<String, String>> childDtaItem;

    ArrayList<ArrayList<Map<String, String>>> childData;

    Map<String, String> m;

    ExpandableListView elvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissan_models);

        R34 = (Button) findViewById(R.id.R34);
        R34.setOnClickListener(this);

        ALSI_1 = (Button) findViewById(R.id.ALSI_1);
        ALSI_1.setOnClickListener(this);

        ALSI_2 = (Button) findViewById(R.id.ALSI_2);
        ALSI_2.setOnClickListener(this);

        groupData = new ArrayList<Map<String, String>>();
        for (String group : groups){
            m = new HashMap<String, String>();
            m.put("groupName", group);
            groupData.add(m);
        }
        String groupFrom[] = new String[] {"groupName"};
        int groupTo[] = new int[] {android.R.id.text1};

        childData = new ArrayList<ArrayList<Map<String, String>>>();

        childDtaItem = new ArrayList<Map<String, String>>();

        for (String phone : Skyline){
            m = new HashMap<String, String>();
            m.put("phoneName", phone);
            childDtaItem.add(m);
        }
        childData.add(childDtaItem);


        String childFrom[] = new String[] {"phoneName"};
        int childTo[] = new int[] {android.R.id.text1};

        SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter(
                this,
                groupData,
                android.R.layout.simple_expandable_list_item_1,
                groupFrom,
                groupTo,
                childData,
                android.R.layout.simple_list_item_1,
                childFrom,
                childTo);

        elvMain = (ExpandableListView) findViewById(R.id.elvMain);
        elvMain.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ALSI_1:
                Intent alsi1 = new Intent(this, com.chumpik.jdmapp.nissan.nissan_models.ALSI_1.class);
                startActivity(alsi1);
                break;
            case R.id.ALSI_2:
                Intent alsi2 = new Intent(this, com.chumpik.jdmapp.nissan.nissan_models.ALSI_2.class);
                startActivity(alsi2);
                break;
            case R.id.R34:
                Intent r34 = new Intent (this, com.chumpik.jdmapp.nissan.nissan_models.R34.class);
                startActivity(r34);
                break;

        }

    }



}
