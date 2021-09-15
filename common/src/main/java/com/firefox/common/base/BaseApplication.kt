package com.firefox.common.base

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.firefox.common.utils.Config

open class BaseApplication : Application() {
    val isDebug = false
    override fun onCreate() {
        super.onCreate()
        Log.d(Config.TAG, "common/BaseApplication onCreate run")
        if (isDebug){
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this);
    }

    override fun onTerminate() {
        super.onTerminate()
        ARouter.getInstance().destroy()
    }
}