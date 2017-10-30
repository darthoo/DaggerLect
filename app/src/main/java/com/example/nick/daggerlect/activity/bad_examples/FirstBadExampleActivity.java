package com.example.nick.daggerlect.activity.bad_examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nick.daggerlect.R;
import com.google.gson.Gson;

import com.example.nick.daggerlect.api.SuperApi;
import com.example.nick.daggerlect.api.SuperApiImpl;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class FirstBadExampleActivity extends AppCompatActivity {

    private SuperApi superApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bad_example);

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        OkHttpClient client = new OkHttpClient.Builder().build();
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl("https://api.com")
                .build();

        superApi = new SuperApiImpl(retrofit, gson);
        superApi.doAwesomeThing();
    }
}
