package com.trippaper.doparkteam.trippaper;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.nfc.Tag;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btn_floatingBtn_AddPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼 추가

        btn_floatingBtn_AddPlan = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        btn_floatingBtn_AddPlan.setOnClickListener(mClickListner_FloatingBtn_AddPlan);

        //툴바 타이틀 변경

        try {
            Integer titleId = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
            TextView title = (TextView) getWindow().findViewById(titleId);
            // check for null and manipulate the title as see fit
            Typeface typeFace = getResources().getFont(R.font.nanumsquareroundr);
            title.setTypeface(typeFace);
        } catch (Exception e) {
        }

        getSupportActionBar().setTitle("TRIP PAPER");
    }

    Button.OnClickListener mClickListner_FloatingBtn_AddPlan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, AddplanActivity.class);
            startActivity(intent);
        }
    };

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.app_bar_search:
                Intent intent = new Intent(MainActivity.this, SetupActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
