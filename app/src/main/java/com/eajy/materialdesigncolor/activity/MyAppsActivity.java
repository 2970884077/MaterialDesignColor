package com.eajy.materialdesigncolor.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.eajy.materialdesigncolor.Data;
import com.eajy.materialdesigncolor.R;
import com.eajy.materialdesigncolor.adapter.MyAppsAdapter;

public class MyAppsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_apps);

        Toolbar toolbar = findViewById(R.id.toolbar_my_apps);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        RecyclerView recycler_my_apps = findViewById(R.id.recycler_my_apps);
        MyAppsAdapter adapter = new MyAppsAdapter(this, Data.getMyAppsData());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recycler_my_apps.setLayoutManager(linearLayoutManager);
        recycler_my_apps.setAdapter(adapter);
    }

}
