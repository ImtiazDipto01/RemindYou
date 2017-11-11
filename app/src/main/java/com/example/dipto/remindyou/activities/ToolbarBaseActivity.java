package com.example.dipto.remindyou.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.dipto.remindyou.R;

/**
 * Created by Dipto on 11/10/2017.
 */

public class ToolbarBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hideStatusBar();
    }

    private void hideStatusBar() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void toolbarWithoutBackPressed(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*TextView toolbar_title = (TextView) findViewById(R.id.toolbar_title);
        showCustomToolbar(toolbar);
        toolbar_title.setText(toolbartitle);*/
    }

    public void toolbarWithBackPressed(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        showCustomToolbar(toolbar);
    }

    private void showCustomToolbar(Toolbar toolbar){
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
