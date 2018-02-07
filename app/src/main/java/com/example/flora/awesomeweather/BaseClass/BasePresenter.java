package com.example.flora.awesomeweather.BaseClass;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Flora on 7/02/2018.
 */

public abstract class BasePresenter {
    private final BaseActivity mBaseActivity;
    protected Context mContext;
    protected SharedPreferences mSharedPreferences;

    public BasePresenter(Context sContext, BaseActivity sBaseActivity, SharedPreferences sSharedPreferences) {
        this.mContext = sContext;
        this.mBaseActivity = sBaseActivity;
        this.mSharedPreferences = sSharedPreferences;
    }
}
