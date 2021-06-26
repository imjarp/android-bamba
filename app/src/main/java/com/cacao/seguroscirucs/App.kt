package com.cacao.seguroscirucs

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.vivebamba.client.infrastructure.ApiClient

class App : MultiDexApplication() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)

    }

    override fun onCreate() {
        super.onCreate()
        ApiClient.apiKey["x-api-key"] = "7f6f4a56-9627-4e13-a51d-c2527eb8242f"
    }

}