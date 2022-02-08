package com.zzm.wallet.ui.activity.newAccount

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.zzm.wallet.core.BaseActivity
import com.zzm.wallet.databinding.ActivityNewAccountBinding

class NewAccountActivity:BaseActivity() {
  private lateinit var binding: ActivityNewAccountBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityNewAccountBinding.inflate(layoutInflater)
    setContentView(binding.root)
    initView()
    initEvent()
  }

  private fun initView() {
  }
  private fun initEvent() {
    binding.cash.setOnClickListener{
      NewAccountDetailActivity.start(mContext)
    }
  }
  companion object{
    fun start(context: Context) {
      context.startActivity(Intent(context, NewAccountActivity::class.java))
    }
  }
}