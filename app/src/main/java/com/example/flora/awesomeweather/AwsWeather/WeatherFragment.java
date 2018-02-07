package com.example.flora.awesomeweather.AwsWeather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flora.awesomeweather.BaseClass.BaseFragment;
import com.example.flora.awesomeweather.R;
import com.example.flora.awesomeweather.Utilities.MyEditText;

import butterknife.BindView;
import butterknife.ButterKnife;


public class WeatherFragment extends BaseFragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public  String mSearchCity;

    @BindView(R.id.searchCity)
    MyEditText searchCity;

    private String mParam1;
    private String mParam2;


    public WeatherFragment() {

    }

    public static WeatherFragment newInstance(String param1, String param2) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_weather, container, false);
        mUnbinder = ButterKnife.bind(this, view);
        mSearchCity=searchCity.getContent();
        return view;
    }

}
