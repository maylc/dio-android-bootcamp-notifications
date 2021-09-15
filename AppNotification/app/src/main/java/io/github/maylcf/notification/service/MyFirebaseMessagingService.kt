package io.github.maylcf.notification.service

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import io.github.maylcf.notification.showNotification

class MyFirebaseMessagingService : FirebaseMessagingService() {

    private val tag = "FirebaseMessagingService"

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.i("Mayara", message.from.toString())

        if (message.notification != null) {
            this.showNotification(
                "1234",
                message?.notification?.title.toString(),
                message?.notification?.body.toString()
            )
        }
    }

}