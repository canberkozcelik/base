package com.bco.myapplication.ui.splash.view

import com.bco.myapplication.base.view.BaseView

interface SplashView : BaseView {
    fun showSuccessToast()
    fun showErrorToast()
    fun openMainActivity()
//    fun openLoginActivity()
}
