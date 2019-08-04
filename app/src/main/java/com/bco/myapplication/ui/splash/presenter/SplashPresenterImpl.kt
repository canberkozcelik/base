package com.bco.myapplication.ui.splash.presenter

import com.bco.myapplication.base.presenter.BasePresenterImpl
import com.bco.myapplication.ui.splash.interactor.SplashInteractor
import com.bco.myapplication.ui.splash.view.SplashView
import com.bco.myapplication.utils.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by canberkozcelik on 2019-08-05.
 */
class SplashPresenterImpl<V : SplashView, I : SplashInteractor> @Inject internal constructor(
    interactor: I,
    schedulerProvider: SchedulerProvider,
    disposable: CompositeDisposable
) : BasePresenterImpl<V, I>(
    interactor = interactor,
    schedulerProvider = schedulerProvider,
    compositeDisposable = disposable
), SplashPresenter<V, I> {

    override fun onAttach(view: V?) {
        super.onAttach(view)
        feedInDatabase()
    }

    private fun feedInDatabase() = interactor?.let {
        /*compositeDisposable.add(it.seedQuestions()
            .flatMap { interactor?.seedOptions() }
            .compose(schedulerProvider.ioToMainObservableScheduler())
            .subscribe({
                getView()?.let { decideActivityToOpen() }
            })
        )*/
    }

    private fun decideActivityToOpen() = getView()?.let {
        if (isUserLoggedIn())
            it.openMainActivity()
        /*else
            it.openLoginActivity()*/
    }

    private fun isUserLoggedIn(): Boolean {
        /*interactor?.let { return it.isUserLoggedIn() }*/
        return false
    }

}