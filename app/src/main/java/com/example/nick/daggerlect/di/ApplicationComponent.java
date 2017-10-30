package com.example.nick.daggerlect.di;

import com.example.nick.daggerlect.activity.AlmostGoodExampleActivity;
import com.example.nick.daggerlect.api.SuperApi;
import com.example.nick.daggerlect.presenter.SuperPresenter;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by nick on 30.10.17.
 */
@Singleton
@Component (modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(AlmostGoodExampleActivity almostGoodExampleActivity);

    void inject (SuperPresenter superPresenter);

    SuperApi superApi();

    Gson gson();

    Retrofit retrofit();

    OkHttpClient okhttpClient();
}
