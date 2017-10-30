package com.example.nick.daggerlect;

import javax.inject.Inject;

import retrofit2.Retrofit;

/**
 * Created by nick on 30.10.17.
 */

public class ApiHelper {

    boolean isCanHelp;

    @Inject
    protected Retrofit retrofit;

    @Inject
    public ApiHelper() {
        this.isCanHelp = true;
    }
}
