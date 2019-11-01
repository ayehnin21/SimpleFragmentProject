package com.coder.mm.mypraticeapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSetting.setOnClickListener {
            val intent = Intent(this@LoginActivity, SettingActivity::class.java)
            startActivity(intent)
        }
      val fm=supportFragmentManager
        fm.beginTransaction().add(R.id.fragLinear,FragOne(),"frag_one").commit()
        btnGetPref.setOnClickListener {
            var cd_firm = getPrefValue(this@LoginActivity, "cd_key")
            var ip = getPrefValue(this@LoginActivity, "IP")
            Log.d("my_message", "cd_firm is $cd_firm and ip is $ip and sub1 is" )
        }

    }

    fun getPrefValue(context: Context, key: String): String {
        val mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        return mySharedPreferences.getString(key, "error").toString()
    }


}
