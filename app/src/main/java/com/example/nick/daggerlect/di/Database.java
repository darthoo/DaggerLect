package com.example.nick.daggerlect.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by nick on 31.10.17.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface Database {
}
