package com.example.sharedpreference.helper

import android.content.Context
import android.content.SharedPreferences

class PreferencesHelper(context: Context) {

    private val PREF_NAME ="sharedPreferencesKotlin123"
    private var sharedPref: SharedPreferences
    val editor: SharedPreferences.Editor

    init{
        sharedPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        editor = sharedPref.edit()
    }

    //function save data
    fun put(key: String, value: String){
        editor.putString(key,value)
            .apply()
    }

    //get value
    fun getString(key: String):String?{
        return sharedPref.getString( key,null)
    }

    fun put(key: String, value:Boolean){
        editor.putBoolean(key,value)
            .apply()
    }

    fun getBoolean(key: String):Boolean{
        return sharedPref.getBoolean( key,false)
    }

    fun clear(){
        editor.clear()
            .apply()
    }

    fun put(prefUsername: String) {

    }

}