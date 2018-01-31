package com.example.flora.awesomeweather.Modules;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Flora on 31/01/2018.
 */

public class Main {
    @SerializedName("tempreture")
    @Expose
    public Double tempreture;
    @SerializedName("pressure")
    @Expose
    public Float pressure;
    @SerializedName("humidity")
    @Expose
    public Integer humidity;
    @SerializedName("min_temp")
    @Expose
    public Double minTemp;
    @SerializedName("max_temp")
    @Expose
    public Double maxTemp;
}
