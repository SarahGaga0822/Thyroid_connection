package com.example.thyroid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ViewReportPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_report_page);

        ActionBar actionBar =getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("查看报告");
    }
}