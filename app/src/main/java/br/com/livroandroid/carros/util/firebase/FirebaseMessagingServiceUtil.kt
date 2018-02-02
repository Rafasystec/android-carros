package br.com.livroandroid.carros.util.firebase

import android.content.Intent
import android.support.v4.content.LocalBroadcastManager
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 * Created by idoctor on 02/02/2018.
 */
class FirebaseMessagingServiceUtil: FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        handleNotification(remoteMessage!!.notification?.body)
    }

    private fun handleNotification(body: String?) {
        val pushNotification = Intent(Config.STR_PUSH)
        pushNotification.putExtra("message",body)
        LocalBroadcastManager.getInstance(this).sendBroadcast(pushNotification)
    }
}