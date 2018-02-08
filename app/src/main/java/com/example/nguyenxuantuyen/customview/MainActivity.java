package com.example.nguyenxuantuyen.customview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.example.nguyenxuantuyen.customview.ViewCustom.*;

public class MainActivity extends AppCompatActivity {

    LinearLayout llLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llLayout = (LinearLayout) findViewById(R.id.ll_content);

        //textview
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
        custom_TextView textView = new custom_TextView(MainActivity.this);
        textView.setLayoutParams(layoutParams);
        textView.setText("tuyen");
        textView.setTextSize(20);
        //textView.sizexx(500, 100);

        llLayout.addView(textView);
        //endtextview
    }
}
