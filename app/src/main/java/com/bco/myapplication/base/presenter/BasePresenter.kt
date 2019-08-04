package com.bco.myapplication.base.presenter

import com.bco.myapplication.base.interactor.BaseInteractor
import com.bco.myapplication.base.view.BaseView

interface BasePresenter<V : BaseView, I : BaseInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?
}
