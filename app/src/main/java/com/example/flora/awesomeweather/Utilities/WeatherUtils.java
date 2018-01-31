package com.example.flora.awesomeweather.Utilities;

/**
 * Created by Flora on 31/01/2018.
 */

public class WeatherUtils {
    public static float convertKelvinToCels(double kelvin){
        return (float)(kelvin-273.15);
    }

    public static float convertKelvinToFar(double kelvin) {
        return (float) (((convertKelvinToCels(kelvin) - 32) / 1.8));
    }
}
