package com.example.dipto.remindyou.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;

import com.example.dipto.remindyou.R;
import com.example.dipto.remindyou.fragments.AddNewReminderFragment;
import com.example.dipto.remindyou.models.HomeToRemiderModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Dipto on 11/11/2017.
 */

public class ReminderActivity extends ToolbarBaseActivity {

    @BindView(R.id.reminder_framelayout)
    FrameLayout reminderFramelayout;

    List<HomeToRemiderModel> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            list = (List<HomeToRemiderModel>) bundle.getSerializable("list");

            HomeToRemiderModel homeToRemiderModel = list.get(0) ;

            if(homeToRemiderModel.getFragment_flag().equals("2")){
                setFragmentAddReminder();
            }
            else if(homeToRemiderModel.getFragment_flag().equals("1")){

            }
        }
    }


    private void setFragmentAddReminder(){
        AddNewReminderFragment addNewReminderFragment = new AddNewReminderFragment();
        FragmentTransaction add_new_remider_ft = getSupportFragmentManager().beginTransaction();
        add_new_remider_ft.replace(R.id.reminder_framelayout, addNewReminderFragment, "Add Reminder Fragment");
        add_new_remider_ft.commit();
    }

    private void setFragmentReminderList(){

    }
}
