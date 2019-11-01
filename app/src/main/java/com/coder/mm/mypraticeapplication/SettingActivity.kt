package com.coder.mm.mypraticeapplication

import android.os.Bundle
import android.preference.PreferenceActivity

class SettingActivity:PreferenceActivity() {
    private val prefs = R.xml.pref_setting

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(prefs)
    }

}