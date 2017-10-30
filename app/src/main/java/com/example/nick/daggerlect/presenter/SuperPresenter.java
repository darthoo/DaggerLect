package com.example.nick.daggerlect.presenter;

import com.example.nick.daggerlect.api.SuperApi;

import javax.inject.Inject;

/**
 * Created by nick on 31.10.17.
 */

public class SuperPresenter implements ISuperPresenter{

    @Inject
    protected SuperApi superApi;

    @Inject
    public SuperPresenter() {
        super();
    }

    @Override
    public String doAwesomeThing() {
        return superApi.doAwesomeThing();
    }
}
