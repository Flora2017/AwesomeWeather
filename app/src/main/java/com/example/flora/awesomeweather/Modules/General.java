package com.example.flora.awesomeweather.Modules;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Flora on 31/01/2018.
 */

public class General {
    @SerializedName("id")
    @Expose
    public Integer id;

    @SerializedName("country")
    @Expose
    public String country;

    @SerializedName("information")
    @Expose
    public Double information;



    @SerializedName("sunrise")
    @Expose
    public Integer sunrise;

    @SerializedName("sunset")
    @Expose
    public Integer sunset;

    @SerializedName("type")
    @Expose
    public Integer type;
}
