package com.thedeveloperworldisyours.dagger2mockitoxi.di;

import android.content.Context;

import com.thedeveloperworldisyours.dagger2mockitoxi.MainActivity;

import dagger.Component;

/**
 * Created by javierg on 22/07/16.
 */
@AppScope
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity activity);

    @AppScope
    Context appContext();
}
