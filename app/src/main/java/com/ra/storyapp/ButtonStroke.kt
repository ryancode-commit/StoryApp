package com.ra.storyapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat

class ButtonStroke : AppCompatButton {

    private lateinit var btnBackground: Drawable
    private var txtColor: Int = 0

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        background = btnBackground
        setTextColor(txtColor)
        textSize = 12f
        gravity = Gravity.CENTER
        text = "DAFTAR"
    }
    private fun init() {
        txtColor = ContextCompat.getColor(context, android.R.color.background_light)
        btnBackground = ContextCompat.getDrawable(context, R.drawable.bg_button_strokel) as Drawable
    }
}