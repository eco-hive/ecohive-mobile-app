package com.ecohive.app.utils

import android.content.Intent
import android.net.Uri
import android.content.Context

private lateinit var appContext: Context

fun setLinkOpenerContext(context: Context) {
    appContext = context.applicationContext
}

actual fun openLink(url: String) {
    if (::appContext.isInitialized) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        appContext.startActivity(intent)
    } else {
        println("Context not initialized for openLink")
    }
}
