package com.example.nick.daggerlect;

import android.app.Application;

import com.example.nick.daggerlect.di.ApplicationComponent;
import com.example.nick.daggerlect.di.ApplicationModule;
import com.example.nick.daggerlect.di.DaggerApplicationComponent;

/**
 * Created by nick on 30.10.17.
 */

public class App extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
