package alquran.latheef.jelita.ui

import android.app.Application

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        BookmarkManager.initialize(this)
    }
}