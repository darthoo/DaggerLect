package com.example.nick.daggerlect.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.nick.daggerlect.ApiHelper;
import com.example.nick.daggerlect.App;
import com.example.nick.daggerlect.BaseActivity;
import com.example.nick.daggerlect.R;
import com.example.nick.daggerlect.api.SuperApi;

import javax.inject.Inject;

public class AlmostGoodExampleActivity extends BaseActivity {

    @Inject
    protected SuperApi superApi;

    @Inject
    protected ApiHelper apiHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ( (App)getApplication()).getComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Activity","========="+superApi.doAwesomeThing()+"==========");
    }
}
