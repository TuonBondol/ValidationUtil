package com.tuonbondol.validationutil

import android.text.TextUtils

/***
 *
 * @author TUON BONDOL
 *
 */

fun isValidEmail(target: CharSequence): Boolean = !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches()

fun isMatchPassword(currentPassword: CharSequence, newPassword:CharSequence):Boolean {
    while (currentPassword == newPassword){
        return true
    }
    return false
}