package com.byx.xiuxiu.mygitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("搭顺风车");
        tv.setText("上都夫人");
    }
}
