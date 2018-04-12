package com.example.ragasoft.ladwagaushala.utills;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by A on 31-05-2016.
 */
public class MySharedData {
    private static final String FREEDEALS_PRIVATE_PREF = "freedeals_private_session";
    private static SharedPreferences FreeDealsSession;
    private static SharedPreferences.Editor editor;
    private static int PRIVATE_MODE = 0;

    /**
     * constructor to initialize the shared preferances.
     *
     * @param context
     */
    public MySharedData(Context context) {
        FreeDealsSession = context.getSharedPreferences(FREEDEALS_PRIVATE_PREF, PRIVATE_MODE);
    }


    public static void initializePreference(Context context) {
        FreeDealsSession = context.getSharedPreferences(FREEDEALS_PRIVATE_PREF, PRIVATE_MODE);
        editor = FreeDealsSession.edit();
    }

    public static void clearPreference() {
        editor.clear();
        editor.commit();
    }



    /**
     * set data  in shared preferences
     */
    public static void setGeneralSaveSession(String key, String value) {
        editor = FreeDealsSession.edit();
        editor.putString(key, value);
        editor.commit();
    }

    //    SharedPreferences settings = getSharedPreferences()

    /**
     * get  data  from shared preferences
     */
    public static String getGeneralSaveSession(String key) {
        return FreeDealsSession.getString(key, "");
    }

    /**
     * set data  in shared preferences
     */
    public static void setGeneralSaveSession2(String key, boolean value) {
        editor = FreeDealsSession.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }


    /**
     * get  data  from shared preferences
     *
     * @param key
     */
    public static boolean getGeneralSaveSession2(String key) {
        return FreeDealsSession.getBoolean(key, true);
    }

    /**
     * Remove data from shared preferences.
     */
    public static void removeGeneralSaveSession(String key) {
        SharedPreferences.Editor editor = FreeDealsSession.edit();
        editor.remove(key);
        editor.commit();
    }
}
