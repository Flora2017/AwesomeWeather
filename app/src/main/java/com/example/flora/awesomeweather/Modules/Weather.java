package com.example.flora.awesomeweather.Modules;

import android.content.Intent;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Flora on 31/01/2018.
 */

public class Weather {
    @SerializedName("id")
    @Expose
    public Intent id;

    @SerializedName("main")
    @Expose
    public String main;

    @SerializedName("description")
    @Expose
    public String description;

    @SerializedName("icon")
    @Expose
    public String icon;
}
