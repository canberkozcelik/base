package com.bco.myapplication.ui.splash.presenter

import com.bco.myapplication.base.presenter.BasePresenter
import com.bco.myapplication.ui.splash.interactor.SplashInteractor
import com.bco.myapplication.ui.splash.view.SplashView

interface SplashPresenter<V : SplashView, I : SplashInteractor> : BasePresenter<V, I>