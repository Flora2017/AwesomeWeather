package com.example.flora.awesomeweather.Modules;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Flora on 31/01/2018.
 */

public class WeatherData {
    @SerializedName("id")
    @Expose
    public Integer id;

    @SerializedName("weather")
    @Expose
    public List<Weather> weather = new ArrayList<Weather>();

    @SerializedName("general")
    @Expose
    public General general;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("base")
    @Expose
    public String base;

    @SerializedName("main")
    @Expose
    public Main main;

    @SerializedName("visibility")
    @Expose
    public Integer visibility;

    @SerializedName("clouds")
    @Expose
    public Clouds clouds;

    @SerializedName("wind")
    @Expose
    public Wind wind;

    @SerializedName("rain")
    @Expose
    public Rain rain;

    @SerializedName("coord")
    @Expose
    public Coord coord;

    @SerializedName("dt")
    @Expose
    public Integer dt;

    @SerializedName("cod")
    @Expose
    public Integer cod;




}
