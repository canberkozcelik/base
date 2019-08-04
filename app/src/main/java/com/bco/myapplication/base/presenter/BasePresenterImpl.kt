package com.bco.myapplication.base.presenter

import com.bco.myapplication.base.interactor.BaseInteractor
import com.bco.myapplication.base.view.BaseView
import com.bco.myapplication.utils.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by canberkozcelik on 2019-08-05.
 */
abstract class BasePresenterImpl<V : BaseView, I : BaseInteractor> internal constructor(
    protected var interactor: I?,
    protected val schedulerProvider: SchedulerProvider,
    protected val compositeDisposable: CompositeDisposable
) : BasePresenter<V, I> {

    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun getView(): V? = view

    override fun onDetach() {
        compositeDisposable.dispose()
        view = null
        interactor = null
    }

}