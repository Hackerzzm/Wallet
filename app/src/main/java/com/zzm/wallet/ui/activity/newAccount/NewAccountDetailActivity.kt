package com.zzm.wallet.ui.activity.newAccount

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.zzm.wallet.core.BaseActivity
import com.zzm.wallet.databinding.ActivityNewAccountBinding
import com.zzm.wallet.databinding.ActivityNewAccountDetailBinding

class NewAccountDetailActivity:BaseActivity() {
  private lateinit var binding: ActivityNewAccountDetailBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityNewAccountDetailBinding.inflate(layoutInflater)
    setContentView(binding.root)
    initView()
    initEvent()
  }

  private fun initView() {
  }
  private fun initEvent() {

  }
  companion object{
    fun start(context: Context) {
      context.startActivity(Intent(context, NewAccountDetailActivity::class.java))
    }
  }
}