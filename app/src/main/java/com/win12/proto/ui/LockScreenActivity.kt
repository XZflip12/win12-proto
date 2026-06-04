package com.win12.proto.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.win12.proto.R
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class LockScreenActivity : AppCompatActivity() {

    private lateinit var timeTextView: TextView
    private lateinit var dateTextView: TextView
    private lateinit var unlockButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lock_screen)
        setupUI()
        updateTime()
    }

    private fun setupUI() {
        timeTextView = findViewById(R.id.lock_time)
        dateTextView = findViewById(R.id.lock_date)
        unlockButton = findViewById(R.id.unlock_button)

        unlockButton.setOnClickListener {
            finish()
        }
    }

    private fun updateTime() {
        val calendar = Calendar.getInstance()
        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        val dateFormat = SimpleDateFormat("EEEE, MMMM d", Locale.getDefault())

        timeTextView.text = timeFormat.format(calendar.time)
        dateTextView.text = dateFormat.format(calendar.time)
    }
}
