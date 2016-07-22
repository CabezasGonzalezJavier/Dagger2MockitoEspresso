package com.thedeveloperworldisyours.dagger2mockitoxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.joda.time.DateTime;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_MILLIS = "millis";

    @Inject
    HelloGreeter mHelloGreeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).appComponent().inject(this);

        TextView todayView = (TextView) findViewById(R.id.date);

        String result = mHelloGreeter.getGreeting("Cabezas");


        todayView.setText(result);
    }
}
