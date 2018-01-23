package br.com.livroandroid.carros

import android.app.Application
import android.util.Log
import java.lang.IllegalStateException

/**
 * Created by idoctor on 22/01/2018.
 */
class CarrosApplication: Application() {

    private val TAG = "CarrosApplication"
    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {
        private var appInstance: CarrosApplication? = null
        fun getInstance(): CarrosApplication{
            if(appInstance == null){
                throw IllegalStateException("Configure the Application class on AndroidManifest.xml")
            }
            return appInstance!!
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(TAG,"CarrosApplication invoked method onTerminate()")
    }
}