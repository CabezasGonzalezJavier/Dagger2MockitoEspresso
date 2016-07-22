package com.thedeveloperworldisyours.dagger2mockitoxi;

import android.content.Intent;
import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import javax.inject.Inject;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by javierg on 22/07/16.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Inject
    HelloGreeter mHelloGreeter;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() {
        ((TestApp) activityTestRule.getActivity().getApplication()).appComponent().inject(this);
    }
    @Test
    public void today() {
        Mockito.when(mHelloGreeter.getGreeting("Cabezas")).thenReturn("Hello Cabezas");

        activityTestRule.launchActivity(new Intent());
        SystemClock.sleep(5500);
        onView(withId(R.id.date))
                .check(matches(withText("Hello Cabezas")));

    }

}
