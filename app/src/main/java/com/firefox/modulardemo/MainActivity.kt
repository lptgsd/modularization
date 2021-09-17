package com.firefox.modulardemo

import android.os.Bundle
import android.widget.Toast
import com.firefox.common.base.BaseActivity
import com.xxx.library.HomeFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.flContainer,HomeFragment()).commit()
    }

    fun test(view: android.view.View) {
        Toast.makeText(this,"clicke",Toast.LENGTH_LONG).show()
    }
}