package com.example.flora.awesomeweather.Modules;

import com.example.flora.awesomeweather.Utilities.WeatherUtils;

/**
 * Created by Flora on 31/01/2018.
 */

public class WeatherItem {
    private final String mCity;
    private final String mImage;
    private final int mHumidity;
    private final float mTempretureCelsius;
    private final float mWind;
    private final float mRainLevel;


    public WeatherItem(String sCity, String sImage, int sHumidity, float sTempretureCelsius, float sWind, float sRainLevel) {
        this.mCity = sCity;
        this.mImage = sImage;
        this.mHumidity = sHumidity;
        this.mTempretureCelsius = sTempretureCelsius;
        this.mWind = sWind;
        this.mRainLevel = sRainLevel;
    }

    public WeatherItem(String sCity, String sImage, int sHumidity, double kelvin, float sWind, float sRainLevel) {
        this.mCity = sCity;
        this.mImage = sImage;
        this.mHumidity = sHumidity;
        this.mTempretureCelsius = WeatherUtils.convertKelvinToCels(kelvin);
        this.mWind = sWind;
        this.mRainLevel = sRainLevel;
    }

    public String getCity() {
        return mCity;
    }

    public String getImage() {
        return mImage;
    }

    public int getHumidity() {
        return mHumidity;
    }

    public float getTempretureCelsius() {
        return mTempretureCelsius;
    }

    public float getWind() {
        return mWind;
    }

    public float getRainLevel() {
        return mRainLevel;
    }
}
