package com.example.admin.laba1;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.annotation.ColorInt;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String text = getIntent().getStringExtra("login");
        boolean male = getIntent().getBooleanExtra("male",false);
        TextView tx = (TextView)findViewById(R.id.textView6);

        if (male){
            tx.setTextColor(Color.RED);
        } else {
            tx.setTextColor(Color.BLUE);
        }
        tx.setText(text);
    }

}
