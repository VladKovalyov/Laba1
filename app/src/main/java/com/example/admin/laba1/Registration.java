package com.example.admin.laba1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Switch;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ProgressBar pb = (ProgressBar)findViewById(R.id.progressBar);
        pb.setVisibility(View.INVISIBLE);
    }

    public void onClick(View v){
        ProgressBar pb = (ProgressBar)findViewById(R.id.progressBar);
        pb.setVisibility(View.VISIBLE);

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    EditText ed = (EditText) findViewById(R.id.editText2);
                    Switch aSwitch = (Switch) findViewById(R.id.switch1);
                    Intent intent = new Intent(Registration.this,ResultActivity.class);
                    intent.putExtra("login",ed.getText().toString());
                    intent.putExtra("male",aSwitch.isChecked());
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });th.start();
               /*TextView tv = (TextView)findViewById(R.id.textView);


        if(tv.getVisibility() == View.VISIBLE){
            tv.setVisibility(View.INVISIBLE);
        } else {
            tv.setVisibility(View.VISIBLE);
        }*/
    }
}
