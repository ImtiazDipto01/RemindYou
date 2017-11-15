package com.example.dipto.remindyou.fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.dipto.remindyou.R;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Dipto on 11/11/2017.
 */

public class AddNewReminderFragment extends Fragment {

    @BindView(R.id.normal_text)
    TextView normalText;
    Unbinder unbinder;
    int mYear, mMonth, mDay ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_new_reminder, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.normal_text)
    public void onTextClicked() {

        final DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                mYear = year ;
                mMonth = month ;
                mDay = dayOfMonth ;

                Log.d("+++Change Year++", String.valueOf(mYear)+"as");
                Log.d("+++Change Month++", String.valueOf(mMonth)+"as");
                Log.d("+++Change Day++", String.valueOf(mDay)+"as");
            }
        }, mYear, mMonth, mDay);

        final Calendar calendar = Calendar.getInstance();
        Calendar cal = Calendar.getInstance();
        int yy = calendar.get(Calendar.YEAR);
        int mm = calendar.get(Calendar.MONTH);
        int dd = calendar.get(Calendar.DAY_OF_MONTH);
        //Min date setting part
        cal.set(Calendar.MONTH, mm);
        cal.set(Calendar.DAY_OF_MONTH, dd);
        cal.set(Calendar.YEAR, yy);
        datePickerDialog.getDatePicker().setMinDate(cal.getTimeInMillis());
        //Maximum date setting part
        Calendar calen = Calendar.getInstance();
        calen.set(Calendar.MONTH, mm);
        calen.set(Calendar.DAY_OF_MONTH, dd);
        calen.set(Calendar.YEAR, yy + 10);
        datePickerDialog.getDatePicker().setMaxDate(calen.getTimeInMillis());

        datePickerDialog.show();
    }
}
