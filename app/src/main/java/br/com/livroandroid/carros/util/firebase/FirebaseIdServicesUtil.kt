package br.com.livroandroid.carros.util.firebase

import android.content.Context
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

/**
 * Created by idoctor on 02/02/2018.
 */
class FirebaseIdServicesUtil : FirebaseInstanceIdService() {
    val CURRENT_TOKEN: String = "TOKEN"
    override fun onTokenRefresh() {
        val  recentToken: String? = FirebaseInstanceId.getInstance().token
        Log.d(CURRENT_TOKEN,recentToken)
    }
}