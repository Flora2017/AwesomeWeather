package com.example.flora.awesomeweather.AwsWeather;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.flora.awesomeweather.BaseClass.BaseActivity;
import com.example.flora.awesomeweather.BuildConfig;
import com.example.flora.awesomeweather.R;
import com.example.flora.awesomeweather.Utilities.ActivityUtils;

public class WeatherActivity extends BaseActivity {
   private WeatherFragment mWeatherFragment;
   private  WeatherPresenter mWeatherPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        initContent();
    }

    private void initContent(){
        final SharedPreferences tSharedPreferences=this.getSharedPreferences(BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE);
        mWeatherPresenter=new WeatherPresenter(this,this,tSharedPreferences);
        mWeatherFragment=WeatherFragment.newInstance("testA","testB");
        ActivityUtils.addFragmentToActicity(getSupportFragmentManager(),mWeatherFragment,R.id.content_frame);
    }

}
