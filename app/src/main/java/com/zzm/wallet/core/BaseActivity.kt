package com.zzm.wallet.core

import android.content.Context
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.zzm.wallet.R
import com.zzm.wallet.db.AppDatabase

abstract class BaseActivity : AppCompatActivity() {
  protected lateinit var mContext: Context
  protected lateinit var dbInstance: AppDatabase
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mContext = this
    dbInstance = AppDatabase.getInstance(mContext)!!
    MyApplication.addActivity(this)
    statusBarSet()
  }

  override fun onDestroy() {
    super.onDestroy()
    MyApplication.finishActivity(this)
  }

  private fun statusBarSet(){
    if (VERSION.SDK_INT >= VERSION_CODES.M) {
      window.decorView.systemUiVisibility =
        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }else {
      window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
      window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
      window.statusBarColor = resources.getColor(R.color.colorPrimary)
    }
  }
}