package com.wwl.testlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wwl.testlibrary.config.IAccountProvider;
import com.wwl.testlibrary.config.TestSdkConfig;

public class TestDependencyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_dependency);
        TextView tv = findViewById(R.id.tv_test);
        final IAccountProvider accountProvider = TestSdkConfig.getInstance().getAccountProvider();
        String token = accountProvider.getAccessToken();
        tv.setText(token);
        Button button = findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accountProvider.goLogin(TestDependencyActivity.this, new TestCallback() {
                    @Override
                    public void success(Object o) {
                        Utils.print(o.toString());
                    }

                    @Override
                    public void failure(Object o) {
                        Utils.print(o.toString());
                    }
                });
            }
        });
    }
}
