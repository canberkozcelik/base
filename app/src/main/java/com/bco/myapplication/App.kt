package com.bco.myapplication

import android.app.Activity
import android.app.Application
import com.bco.myapplication.di.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

/**
 * Created by canberkozcelik on 2019-08-04.
 */
class App : Application(), HasActivityInjector{

    @Inject
    lateinit internal var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector() = activityDispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }
}
