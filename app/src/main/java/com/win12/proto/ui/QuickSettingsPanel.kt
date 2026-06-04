package com.win12.proto.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.CompoundButton
import android.widget.LinearLayout
import com.google.android.material.switchmaterial.SwitchMaterial
import com.win12.proto.R

class QuickSettingsPanel @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {

    private lateinit var wifiSwitch: SwitchMaterial
    private lateinit var bluetoothSwitch: SwitchMaterial
    private lateinit var brightnessSwitch: SwitchMaterial
    private lateinit var airplaneModeSwitch: SwitchMaterial

    init {
        orientation = VERTICAL
        LayoutInflater.from(context).inflate(R.layout.quick_settings_panel, this, true)
        setupUI()
    }

    private fun setupUI() {
        wifiSwitch = findViewById(R.id.wifi_switch)
        bluetoothSwitch = findViewById(R.id.bluetooth_switch)
        brightnessSwitch = findViewById(R.id.brightness_switch)
        airplaneModeSwitch = findViewById(R.id.airplane_mode_switch)
    }
}
