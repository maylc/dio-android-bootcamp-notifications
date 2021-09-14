package io.github.maylcf.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendButton = findViewById(R.id.send_notification_button)
        sendButton.setOnClickListener {
            this.showNotification("123", "Bootcamp Android", "Kotlin Course!")
        }
    }
}