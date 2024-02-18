package com.kmp.devfest

import android.app.Application
import cache.filePath

class DevfestApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        filePath = "${filesDir.path}/country_cache.json"
    }
}