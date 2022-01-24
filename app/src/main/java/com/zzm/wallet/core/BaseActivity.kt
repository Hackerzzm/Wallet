package com.zzm.wallet.core

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zzm.wallet.db.AppDatabase

abstract class BaseActivity : AppCompatActivity() {
  protected lateinit var mContext: Context
  protected lateinit var dbInstance: AppDatabase
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    mContext = this
    dbInstance = AppDatabase.getInstance(mContext)!!
    MyApplication.addActivity(this)
  }

  override fun onDestroy() {
    super.onDestroy()
    MyApplication.finishActivity(this)
  }
}