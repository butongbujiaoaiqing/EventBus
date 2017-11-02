package com.walxy.eventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class SecondActivity extends AppCompatActivity {

    private TextView tv_message;
    private Button bt_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
        tv_message = (TextView) this.findViewById(R.id.tv_message);
        tv_message.setText("SecondActivity");
        bt_message = (Button) this.findViewById(R.id.bt_message);
        bt_message.setText("发送事件");
        bt_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MesssageEvent("123123123123123"));
                finish();
            }
        });
    }

    private void initView() {
        tv_message = (TextView) findViewById(R.id.tv_message);
        bt_message = (Button) findViewById(R.id.bt_message);
    }
}
