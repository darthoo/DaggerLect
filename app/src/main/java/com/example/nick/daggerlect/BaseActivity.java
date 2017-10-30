package com.example.nick.daggerlect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nick.daggerlect.di.ApplicationComponent;

public class BaseActivity extends AppCompatActivity {

    protected ApplicationComponent applicationComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        applicationComponent = ((App)getApplication()).getComponent();
    }
}
