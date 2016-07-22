package com.thedeveloperworldisyours.dagger2mockitoxi.di;

import android.content.Context;

import com.thedeveloperworldisyours.dagger2mockitoxi.HelloGreeter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by javierg on 22/07/16.
 */
@Module
public class AppModule {
    private final Context context;

    public AppModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    @AppScope public Context provideAppContext() {
        return context;
    }

    @Provides
    HelloGreeter provideHelloGreeter() {
        return  new HelloGreeter();
    }

}
