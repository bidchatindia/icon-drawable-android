package com.rahulverlekar.fonticon;

import android.app.Application;

import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.joanzapata.iconify.fonts.IoniconsModule;
import com.joanzapata.iconify.fonts.MaterialCommunityModule;
import com.rahulverlekar.fonticon.IconMoon.IconMoonModule;

/**
 * Created by abhik on 22-11-2016.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Iconify.with(new FontAwesomeModule())
                .with(new MaterialCommunityModule())
                .with(new IoniconsModule())
                .with(new IconMoonModule());
    }
}
