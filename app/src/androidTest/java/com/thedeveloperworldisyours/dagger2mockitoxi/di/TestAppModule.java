package com.thedeveloperworldisyours.dagger2mockitoxi.di;

import android.content.Context;

import com.thedeveloperworldisyours.dagger2mockitoxi.HelloGreeter;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;

/**
 * Created by javierg on 22/07/16.
 */
@Module
public class TestAppModule {
    private final Context context;

    public TestAppModule(Context context) {
        this.context = context.getApplicationContext();
    }

    @Provides
    @AppScope public Context provideAppContext() {
        return context;
    }

    @Provides
    public HelloGreeter provideHelloGreeterTest() {
        return Mockito.mock(HelloGreeter.class);
    }
}
