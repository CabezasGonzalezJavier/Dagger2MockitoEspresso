package com.thedeveloperworldisyours.dagger2mockitoxi.di;

import com.thedeveloperworldisyours.dagger2mockitoxi.MainActivityTest;

import dagger.Component;

/**
 * Created by javierg on 22/07/16.
 */
@AppScope
@Component(modules = TestAppModule.class)
public interface TestAppComponent extends AppComponent {

    void inject(MainActivityTest test);
}
