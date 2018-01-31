package com.example.flora.awesomeweather.Modules;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Flora on 31/01/2018.
 */

public class Wind {
    @SerializedName("speed")
    @Expose
    public Float speed;
    @SerializedName("deg")
    @Expose
    public Float deg;
}
