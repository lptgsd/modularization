package com.firefox.common.vm

import androidx.databinding.ObservableChar
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class TempViewModel :ViewModel() {

    var tempText = ObservableField("temp")


}