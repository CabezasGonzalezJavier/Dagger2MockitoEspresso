package com.thedeveloperworldisyours.dagger2mockitoxi;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

/**
 * Created by javierg on 22/07/16.
 */
public class MockTestRunner extends AndroidJUnitRunner {

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException,
            IllegalAccessException, ClassNotFoundException {
        String testApplicationClassName = TestApp.class.getCanonicalName();
        return super.newApplication(cl, testApplicationClassName, context);
    }
}
