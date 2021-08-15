package com.wwl.testdependency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wwl.testlibrary.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.print("hehe le");
    }
}
