package com.example.flora.awesomeweather.Utilities;

import android.app.Application;

import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by Flora on 31/01/2018.
 */

public class WeatherAppilcation extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Iconify.with(new FontAwesomeModule());

    }
}
