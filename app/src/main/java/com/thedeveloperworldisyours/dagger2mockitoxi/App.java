package com.thedeveloperworldisyours.dagger2mockitoxi;

import android.app.Application;

import com.thedeveloperworldisyours.dagger2mockitoxi.di.AppComponent;
import com.thedeveloperworldisyours.dagger2mockitoxi.di.AppModule;
import com.thedeveloperworldisyours.dagger2mockitoxi.di.DaggerAppComponent;

/**
 * Created by javierg on 22/07/16.
 */
public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent appComponent() {
        return appComponent;
    }
}
