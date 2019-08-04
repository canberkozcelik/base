package com.bco.myapplication.di.builder

import com.bco.myapplication.ui.splash.SplashActivityModule
import com.bco.myapplication.ui.splash.view.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [(SplashActivityModule::class)])
    abstract fun bindSplashActivity(): SplashActivity
}