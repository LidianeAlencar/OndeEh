package br.com.lidiane.ondeeh.injection.module

import android.app.Application
import android.content.Context
import br.com.lidiane.ondeeh.base.BaseView
import dagger.Provides

object ContextModule {

    @Provides
    fun provideContext(baseView: BaseView) : Context{
        return baseView.getContext()
    }

    @Provides
    fun provideApplication(context: Context) : Application{
        return context.applicationContext as Application
    }

}