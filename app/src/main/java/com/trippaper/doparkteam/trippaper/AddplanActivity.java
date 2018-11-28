package com.trippaper.doparkteam.trippaper;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddplanActivity extends AppCompatActivity {

    Button btn_selectNation;
    Button btn_selectStartDay;
    Button btn_selectEndDay;
    Button btn_AddPlan;
    Button btn_CancelPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addplan);

        //버튼 가져오기

        btn_selectNation = (Button) findViewById(R.id.btn_selectNation);
        btn_selectStartDay = (Button) findViewById(R.id.btn_selectStartDay);
        btn_selectEndDay = (Button) findViewById(R.id.btn_selectEndDay);
        btn_AddPlan = (Button) findViewById(R.id.btn_AddPlan);
        btn_CancelPlan = (Button) findViewById(R.id.btn_CancelPlan);

        btn_AddPlan.setOnClickListener(mClickListner_CancelPlan);
        btn_CancelPlan.setOnClickListener(mClickListner_CancelPlan);

        //폰트 적용

        Typeface typeFace = getResources().getFont(R.font.nanumsquareroundr);
        btn_selectNation.setTypeface(typeFace);
        btn_selectStartDay.setTypeface(typeFace);
        btn_selectEndDay.setTypeface(typeFace);
        btn_AddPlan.setTypeface(typeFace);
        btn_CancelPlan.setTypeface(typeFace);

        //툴바 타이틀 변경

        getSupportActionBar().setTitle("여행 만들기");
    }

    Button.OnClickListener mClickListner_CancelPlan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AddplanActivity.super.onBackPressed();
        }
    };
}
