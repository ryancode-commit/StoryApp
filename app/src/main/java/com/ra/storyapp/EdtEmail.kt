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
import com.ra.storyapp.utils.isEmailInvalid

class EdtEmail : AppCompatEditText {

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

            override fun onTextChanged(emailText: CharSequence?, p1: Int, p2: Int, p3: Int) {
                val email = emailText.toString()
                when{
                    email.isBlank() -> error = "Tolong masukan Email"
                    email.isEmailInvalid() -> error = "Tolong masukan email yang valid"
                }
            }

            override fun afterTextChanged(p0: Editable?) {
                TODO("Not yet implemented")
            }

        })
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        hint = "Masukkan Email anda"
        background = bgEdt
        setTextColor(txtColor)
        textSize = 14f
        textAlignment = View.TEXT_ALIGNMENT_VIEW_START
    }

}