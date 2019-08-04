package com.bco.myapplication.di.component

import android.app.Application
import com.bco.myapplication.App
import com.bco.myapplication.di.builder.ActivityBuilder
import com.bco.myapplication.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by canberkozcelik on 2019-08-04.
 */
@Singleton
@Component(modules = [(AndroidInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}