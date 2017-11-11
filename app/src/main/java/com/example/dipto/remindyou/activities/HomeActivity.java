package com.example.dipto.remindyou.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;

import com.example.dipto.remindyou.R;
import com.example.dipto.remindyou.models.HomeToRemiderModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Dipto on 11/10/2017.
 */

public class HomeActivity extends ToolbarBaseActivity {

    @BindView(R.id.remider_recyler)
    RecyclerView remiderRecyler;
    @BindView(R.id.add_reminder)
    FloatingActionButton addReminder;
    List<HomeToRemiderModel> homeToRemiderModelList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        toolbarWithoutBackPressed();
        homeToRemiderModelList =  new ArrayList<HomeToRemiderModel>();
    }

    @OnClick(R.id.add_reminder)
    public void onAddReminderClicked() {

        HomeToRemiderModel homeToRemiderModel = new HomeToRemiderModel("2", "");
        homeToRemiderModelList.add(homeToRemiderModel);
        Intent intent = new Intent(getApplicationContext(), ReminderActivity.class);
        intent.putExtra("list", (Serializable) homeToRemiderModelList) ;
        startActivity(intent);
    }
}
