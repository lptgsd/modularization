package com.firefox.common.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.firefox.common.R
import com.firefox.common.base.BaseActivity
import com.firefox.common.databinding.ActivityTempBinding
import com.firefox.common.vm.TempViewModel

class TempActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)
        val binding =
            DataBindingUtil.setContentView<ActivityTempBinding>(this, R.layout.activity_temp)
        binding.viewModel = ViewModelProvider(this).get(TempViewModel::class.java)

    }

}