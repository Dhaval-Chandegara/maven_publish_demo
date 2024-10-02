package com.dc.mylibrary

import android.content.Context
import android.widget.Toast

/**
 * Created by User on 30/09/24.
 */
class ToastUtils {

    companion object {
        fun showToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}