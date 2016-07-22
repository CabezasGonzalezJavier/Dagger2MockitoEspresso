package com.thedeveloperworldisyours.dagger2mockitoxi;

import com.thedeveloperworldisyours.dagger2mockitoxi.di.DaggerTestAppComponent;
import com.thedeveloperworldisyours.dagger2mockitoxi.di.TestAppComponent;
import com.thedeveloperworldisyours.dagger2mockitoxi.di.TestAppModule;

/**
 * Created by javierg on 22/07/16.
 */
public class TestApp extends App {

    private TestAppComponent mTestAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        mTestAppComponent = DaggerTestAppComponent.builder()
                .testAppModule(new TestAppModule(this))
                .build();
    }

    @Override
    public TestAppComponent appComponent() {
        return mTestAppComponent;
    }
}
