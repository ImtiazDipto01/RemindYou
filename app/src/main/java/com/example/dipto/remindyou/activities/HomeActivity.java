package com.example.dipto.remindyou.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dipto.remindyou.R;

/**
 * Created by Dipto on 11/10/2017.
 */

public class HomeActivity extends ToolbarBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbarWithoutBackPressed();
    }
}
