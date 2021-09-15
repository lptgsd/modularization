package com.firefox.common.base

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.firefox.common.utils.Config

open class BaseActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Config.TAG, "common/BaseActivity onCreate run")
    }
}