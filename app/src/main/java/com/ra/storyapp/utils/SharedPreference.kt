package com.ra.storyapp.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPreference(context: Context) {
    private var prefs: SharedPreferences =
    context.applicationContext.getSharedPreferences("StoryApp.RA", Context.MODE_PRIVATE)
    private val editor = prefs.edit()

    fun setStringPreference(prefKey: String, value: String) {
        editor.putString(prefKey, value)
        editor.apply()
    }

    fun setIntPreference(prefKey: String, value: Int) {
        editor.putInt(prefKey, value)
        editor.apply()
    }

    fun setBooleanPreference(prefKey: String, value: Boolean) {
        editor.putBoolean(prefKey, value)
        editor.apply()
    }

    fun clearPreferenceByKey(prefKey: String) {
        editor.remove(prefKey)
        editor.apply()
    }

    fun clearPreferences() {
        editor.clear().apply()
    }
    val getUserName = prefs.getString("ra.key.username", "")
    val getEmail = prefs.getString("ra.key.email", "")
    val getToken = prefs.getString("ra.key.token", "")
    val getUserId = prefs.getString("ra.key.id", "")
    val isLogin = prefs.getBoolean("ra.key.islogin", false)
}