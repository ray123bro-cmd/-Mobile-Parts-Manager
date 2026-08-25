package com.mobileparts.app

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(32, 40, 32, 32)

        val title = TextView(this)
        title.text = "📱 مدير قطع غيار السيارات المتنقلة"
        title.textSize = 24f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER
        title.setPadding(0, 0, 0, 40)

        val productsButton = Button(this)
        productsButton.text = "📦 قطع الغيار"

        val salesButton = Button(this)
        salesButton.text = "🧾 المبيعات"

        val customersButton = Button(this)
        customersButton.text = "👥 العملاء"

        val barcodeButton = Button(this)
        barcodeButton.text = "🔍 قارئ الباركود"

        val settingsButton = Button(this)
        settingsButton.text = "⚙️ الإعدادات"

        layout.addView(title)
        layout.addView(productsButton)
        layout.addView(salesButton)
        layout.addView(customersButton)
        layout.addView(barcodeButton)
        layout.addView(settingsButton)

        setContentView(layout)
    }
}
