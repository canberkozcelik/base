package com.bco.myapplication.ui.splash.interactor

import android.content.Context
import com.bco.myapplication.base.interactor.BaseInteractorImpl
import com.bco.myapplication.data.network.ApiHelper
import com.bco.myapplication.data.preference.PreferenceHelper
import javax.inject.Inject

class SplashInteractorImpl @Inject constructor(
    private val mContext: Context,
    preferenceHelper: PreferenceHelper,
    apiHelper: ApiHelper
) : BaseInteractorImpl(preferenceHelper, apiHelper), SplashInteractor {

    /*override fun getQuestion(): Observable<List<Question>> {
        return questionRepoHelper.loadQuestions()
    }

    override fun seedQuestions(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return questionRepoHelper.isQuestionsRepoEmpty().concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Question::class.java)
                val questionList = gson.fromJson<List<Question>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.SEED_DATABASE_QUESTIONS
                    ),
                    type
                )
                questionRepoHelper.insertQuestions(questionList)
            } else
                Observable.just(false)
        }
    }

    override fun seedOptions(): Observable<Boolean> {
        val builder = GsonBuilder().excludeFieldsWithoutExposeAnnotation()
        val gson = builder.create()
        return optionsRepoHelper.isOptionsRepoEmpty().concatMap { isEmpty ->
            if (isEmpty) {
                val type = `$Gson$Types`.newParameterizedTypeWithOwner(null, List::class.java, Options::class.java)
                val optionsList = gson.fromJson<List<Options>>(
                    FileUtils.loadJSONFromAsset(
                        mContext,
                        AppConstants.SEED_DATABASE_OPTIONS
                    ),
                    type
                )
                optionsRepoHelper.insertOptions(optionsList)
            } else
                Observable.just(false)
        }
    }*/
}