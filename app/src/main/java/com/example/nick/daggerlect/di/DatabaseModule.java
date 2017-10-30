package com.example.nick.daggerlect.di;

import com.example.nick.daggerlect.db.DbHelper;
import com.example.nick.daggerlect.db.IDbHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nick on 31.10.17.
 */

@Module
public class DatabaseModule {

    @Provides @Database
    IDbHelper providesDbHelper(DbHelper dbHelper){
        return dbHelper;
    }
}
