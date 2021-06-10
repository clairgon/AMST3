package com.example.asmt3;

import android.app.usage.UsageEvents;
import android.graphics.Color;
import android.os.Build;
import android.service.autofill.FillEventHistory;
import android.service.autofill.FillEventHistory.Event;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLog;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public class CalendarViewActivity extends AppCompatActivity {
    CalendarView calendarView;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_view);

        calendarView =(CalendarView)findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date =(month+1)+1+"/"+dayOfMonth+"/"+year;
            }
        });

    }
    
}