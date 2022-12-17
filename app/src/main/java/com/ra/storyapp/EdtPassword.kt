package com.ra.storyapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat

class EdtPassword : AppCompatEditText {

    private lateinit var bgEdt: Drawable
    private var txtColor: Int = 0

    constructor(context: Context):super(context){
        init()
    }

    constructor(context: Context, attrs:AttributeSet):super(context, attrs){
        init()
    }

    constructor(context: Context, attrs:AttributeSet, defStyleAttr : Int):super(context, attrs, defStyleAttr){
        init()
    }

    private fun init(){
        bgEdt = ContextCompat.getDrawable(context,R.drawable.bg_border_edt) as Drawable
        txtColor = ContextCompat.getColor(context, android.R.color.black)
        addTextChangedListener(object  : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(passwordText: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val password = passwordText.toString()
                when{
                    password.isBlank() -> error = "Tolong masukan password"
                    password.length < 6 -> error = "Password harus 6 atau lebih dari 6 karakter"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
                TODO("Not yet implemented")
            }

        })
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        hint = "Masukkan password anda"
        background = bgEdt
        setTextColor(txtColor)
        textSize = 14f
        textAlignment = View.TEXT_ALIGNMENT_VIEW_START
    }

}