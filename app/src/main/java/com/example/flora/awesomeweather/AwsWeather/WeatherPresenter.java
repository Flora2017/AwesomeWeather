package com.example.flora.awesomeweather.AwsWeather;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.flora.awesomeweather.BaseClass.BasePresenter;

/**
 * Created by Flora on 7/02/2018.
 */

public class WeatherPresenter extends BasePresenter {
    private WeatherActivity mWeatherActivity;

    public WeatherPresenter(Context sContext, WeatherActivity sWeatherActivity, SharedPreferences sSharedPreferences) {
        super(sContext, sWeatherActivity, sSharedPreferences);
        this.mWeatherActivity = sWeatherActivity;
    }
}
