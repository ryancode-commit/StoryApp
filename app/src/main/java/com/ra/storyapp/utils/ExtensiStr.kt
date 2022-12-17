package com.ra.storyapp.utils

import android.text.TextUtils

fun String.isEmailInvalid(): Boolean  {
    return TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
}