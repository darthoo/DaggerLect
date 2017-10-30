package com.example.nick.daggerlect.di;

import android.content.Context;

import com.example.nick.daggerlect.api.SuperApi;
import com.example.nick.daggerlect.api.SuperApiImpl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by nick on 30.10.17.
 */
@Module
public class ApplicationModule {

    private Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides @Singleton
    OkHttpClient providesOkHttpClient(){
        return new OkHttpClient.Builder().build();
    }

    @Provides @Singleton
    Retrofit providesRetrofit(OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.com")
                .build();

        return retrofit;
    }

    @Provides @Singleton
    Gson providesGson(){
        return new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    }

    @Provides @Singleton
    SuperApi providesApi(SuperApiImpl api){
        return api;
    }
}
