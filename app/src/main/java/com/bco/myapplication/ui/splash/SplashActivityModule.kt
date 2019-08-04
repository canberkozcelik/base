package com.bco.myapplication.ui.splash

import com.bco.myapplication.ui.splash.interactor.SplashInteractor
import com.bco.myapplication.ui.splash.interactor.SplashInteractorImpl
import com.bco.myapplication.ui.splash.presenter.SplashPresenter
import com.bco.myapplication.ui.splash.presenter.SplashPresenterImpl
import com.bco.myapplication.ui.splash.view.SplashView
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    internal fun provideSplashInteractor(splashInteractorImpl: SplashInteractorImpl): SplashInteractor =
        splashInteractorImpl

    @Provides
    internal fun provideSplashPresenter(splashPresenterImpl: SplashPresenterImpl<SplashView, SplashInteractor>)
            : SplashPresenter<SplashView, SplashInteractor> = splashPresenterImpl
}
