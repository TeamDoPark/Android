package com.trippaper.doparkteam.trippaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddplanActivity extends AppCompatActivity {

    Button btn_AddPlan;
    Button btn_CancelPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addplan);

        btn_AddPlan = (Button) findViewById(R.id.btn_AddPlan);
        btn_CancelPlan = (Button) findViewById(R.id.btn_CancelPlan);

        btn_AddPlan.setOnClickListener(mClickListner_CancelPlan);
        btn_CancelPlan.setOnClickListener(mClickListner_CancelPlan);
    }

    Button.OnClickListener mClickListner_CancelPlan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AddplanActivity.super.onBackPressed();
        }
    };
}
