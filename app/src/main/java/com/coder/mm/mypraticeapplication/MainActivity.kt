package com.coder.mm.mypraticeapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btnSetting.setOnClickListener {
            val intent = Intent(this@MainActivity, SettingActivity::class.java)
            startActivity(intent)
        }
      val fm=supportFragmentManager
        fm.beginTransaction().add(R.id.fragLinear,FragOne(),"frag_one").commit()
        btnGetPref.setOnClickListener {
            var key1 = getPrefValue(this@MainActivity, "key1")
            var key2 = getPrefValue(this@MainActivity, "key2")
            Log.d("my_message", "cd_firm is $key1 and ip is $key2 and sub1 is" )
        Toast.makeText(this@MainActivity,"key one is $key1 and key two is $key2",Toast.LENGTH_LONG).show()

        }

    }

    fun getPrefValue(context: Context, key: String): String {
        val mySharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        return mySharedPreferences.getString(key, "error").toString()
    }


}
