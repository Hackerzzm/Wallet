package com.zzm.wallet.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.zzm.wallet.R
import com.zzm.wallet.core.BaseActivity
import com.zzm.wallet.databinding.ActivityMainBinding
import com.zzm.wallet.ui.fragment.main.AccountBookModuleFragment
import com.zzm.wallet.ui.fragment.main.HomePageFragment
import com.zzm.wallet.ui.fragment.main.MineFragment
import com.zzm.wallet.ui.fragment.main.MyAccountBookFragment

class MainActivity : BaseActivity() {
  private lateinit var binding: ActivityMainBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    initView()
  }

  override fun start(context: Context) {
    context.startActivity(Intent(context, MainActivity::class.java))
  }
  companion object{
    const val INDEX_MAIN_MENU = 0
    const val INDEX_MY_ACCOUNT_BOOK = 1
    const val INDEX_ACCOUNT_BOOK_MODULE = 2
    const val INDEX_MINE = 3
  }

  // 项目Fragment 集合
  private val fragments = mapOf<Int, Fragment>(
    INDEX_MAIN_MENU to HomePageFragment(),
    INDEX_MY_ACCOUNT_BOOK to MyAccountBookFragment(),
    INDEX_ACCOUNT_BOOK_MODULE to AccountBookModuleFragment(),
    INDEX_MINE to MineFragment(),
  )

  fun initView() {
    binding.bottomNavView.setOnNavigationItemSelectedListener{
      when(it.itemId){
      }
      true
    }
  }
}