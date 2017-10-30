package com.example.nick.daggerlect.api;

import com.google.gson.Gson;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by nick on 30.10.17.
 */

public class SuperApiImpl implements SuperApi {

    private Retrofit retrofit;
    private Gson gson;

    @Inject
    public SuperApiImpl(Retrofit retrofit, Gson gson) {
        this.retrofit = retrofit;
        this.gson = gson;
    }

    @Override
    public String doAwesomeThing() {
        return "Awesome thing done.";
    }
}
