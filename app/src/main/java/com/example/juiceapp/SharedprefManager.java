package com.example.juiceapp;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.prefs.Preferences;

public class SharedprefManager {

    private final static String SHARED = "juice_shared";
    private static SharedprefManager instance;
    private Context ctx;

    private SharedprefManager (Context ctx) { this.ctx = ctx; }
    public static synchronized SharedprefManager getInstance(Context ctx)
    {
        if (instance == null)
        {
            instance = new SharedprefManager (ctx);
        }
        return instance;
    }

    public void SaveUser (String email, String password)
    {
        SharedPreferences sf = ctx.getSharedPreferences(SHARED,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sf.edit();
        editor.putString("email", email);
        editor.putString("password", password);
        editor.apply();
    }
    public boolean login()
    {
        SharedPreferences sf = ctx.getSharedPreferences(SHARED,Context.MODE_PRIVATE);
        return sf.getString("email", null) != null;
    }
    public void clear()
    {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(SHARED,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
