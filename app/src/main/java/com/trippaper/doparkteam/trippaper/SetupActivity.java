package com.trippaper.doparkteam.trippaper;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class SetupActivity extends AppCompatActivity {

    Button btn_standardBill;
    Button btn_setUp_changeBill;
    Button btn_setUp_category;
    Button btn_appBackUp;
    Button btn_teamIntroduce;
    Button btn_appAssessment;
    Button btn_appVersion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //버튼 추가
        btn_standardBill = (Button) findViewById(R.id.Btn_standardBill);
        btn_setUp_changeBill = (Button) findViewById(R.id.Btn_setUp_changeBill);
        btn_setUp_category = (Button) findViewById(R.id.Btn_setUp_category);
        btn_appBackUp = (Button) findViewById(R.id.Btn_backUp);
        btn_teamIntroduce = (Button) findViewById(R.id.Btn_teamIntroduce);
        btn_appAssessment = (Button) findViewById(R.id.Btn_appAssessment);
        btn_appVersion = (Button) findViewById(R.id.Btn_appVersion);


        //글꼴 적용
        Typeface typeFace = getResources().getFont(R.font.nanumsquareroundr);
        btn_standardBill.setTypeface(typeFace);
        btn_setUp_changeBill.setTypeface(typeFace);
        btn_setUp_category.setTypeface(typeFace);
        btn_appBackUp.setTypeface(typeFace);
        btn_teamIntroduce.setTypeface(typeFace);
        btn_appAssessment.setTypeface(typeFace);
        btn_appVersion.setTypeface(typeFace);

        //툴바 타이틀 변경

        getSupportActionBar().setTitle("설정");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
