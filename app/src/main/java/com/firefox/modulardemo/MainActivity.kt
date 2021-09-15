package com.firefox.modulardemo

import android.os.Bundle
import android.widget.Toast
import com.alibaba.android.arouter.facade.annotation.Route
import com.firefox.common.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun test(view: android.view.View) {
        Toast.makeText(this,"clicke",Toast.LENGTH_LONG).show()
    }
}