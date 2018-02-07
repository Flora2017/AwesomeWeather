package com.example.flora.awesomeweather.Utilities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Flora on 31/01/2018.
 */

public class ActivityUtils {
    public static void addFragmentToActicity(FragmentManager fragmentManager, Fragment fragment, int fragId) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(fragId, fragment);
        transaction.commit();
    }

    public static void switchFragmentInActivity(FragmentManager fragmentManager, Fragment previousFragment, Fragment nextFragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.hide(previousFragment);
        transaction.show(nextFragment);
        transaction.commit();
    }

    public static void goToActivity(Context sContext, Class<?> sCls) {
        goToActivity(sContext, sCls, null);
    }

    public static void goToActivity(Context sContext, Class<?> sCls, Bundle sBundle) {
        Intent intent = new Intent(sContext, sCls);
        if (sBundle != null) {
            intent.putExtras(sBundle);
        }
        sContext.startActivity(intent);
    }

}
