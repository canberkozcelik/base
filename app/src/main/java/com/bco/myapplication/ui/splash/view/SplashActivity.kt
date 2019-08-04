package com.bco.myapplication.ui.splash.view

import android.content.Intent
import android.os.Bundle
import com.bco.myapplication.MainActivity
import com.bco.myapplication.R
import com.bco.myapplication.base.view.BaseActivity
import com.bco.myapplication.ui.splash.interactor.SplashInteractor
import com.bco.myapplication.ui.splash.presenter.SplashPresenter
import javax.inject.Inject

class SplashActivity : BaseActivity(), SplashView {

    @Inject
    lateinit var presenter: SplashPresenter<SplashView, SplashInteractor>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        presenter.onAttach(this)
    }

    override fun onDestroy() {
        presenter.onDetach()
        super.onDestroy()
    }

    override fun onFragmentDetached(tag: String) {
    }

    override fun onFragmentAttached() {
    }

    override fun showSuccessToast() {
    }

    override fun showErrorToast() {
    }

    override fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    /*override fun openLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }*/
}