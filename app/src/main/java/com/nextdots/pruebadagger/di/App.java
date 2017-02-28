package com.nextdots.pruebadagger.di;

import android.app.Application;

/**
 * Created by Ale on 28/02/2017.
 */
public class App extends Application {

    private ComponentTest componentTest;

    @Override
    public void onCreate() {
        super.onCreate();
        componentTest = DaggerComponentTest.builder().moduleTest(new ModuleTest()).build();
    }

    public ComponentTest getComponentTest() {
        return componentTest;
    }
}
