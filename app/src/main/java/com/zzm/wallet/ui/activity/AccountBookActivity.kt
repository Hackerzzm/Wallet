package com.zzm.wallet.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.zzm.wallet.R
import com.zzm.wallet.core.BaseActivity
import com.zzm.wallet.databinding.ActivityAccountBookBinding
import com.zzm.wallet.ui.fragment.accountbook.AccountStatementFragment
import com.zzm.wallet.ui.fragment.accountbook.AssetFragment
import com.zzm.wallet.ui.fragment.accountbook.ChartFragment
import com.zzm.wallet.ui.fragment.accountbook.SettingFragment

class AccountBookActivity : BaseActivity() {
  private lateinit var binding: ActivityAccountBookBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityAccountBookBinding.inflate(layoutInflater)
    setContentView(binding.root)
    initView()
  }

  private fun initView() {
    initFragments()
    binding.viewPager2.adapter = object : FragmentStateAdapter(this) {
      override fun getItemCount(): Int {
        return mainFragments.size
      }

      override fun createFragment(position: Int): Fragment {
        return mainFragments[position]
      }
    }
    binding.viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
      override fun onPageSelected(position: Int) {
        super.onPageSelected(position)
        binding.bottomNavView.menu.getItem(position).isChecked = true
      }
    })
    binding.bottomNavView.setOnNavigationItemSelectedListener {
      when (it.itemId) {
        R.id.tab_asset -> binding.viewPager2.setCurrentItem(0, true)
        R.id.tab_account_statement -> binding.viewPager2.setCurrentItem(1, true)
        R.id.tab_chart -> binding.viewPager2.setCurrentItem(2, true)
        R.id.tab_setting -> binding.viewPager2.setCurrentItem(3, true)
      }
      true
    }
  }

  val mainFragments = mutableListOf<Fragment>()
  private fun initFragments() {
    mainFragments.add(AssetFragment())
    mainFragments.add(AccountStatementFragment())
    mainFragments.add(ChartFragment())
    mainFragments.add(SettingFragment())
  }

  companion object{
    fun start(context: Context) {
      context.startActivity(Intent(context, AccountBookActivity::class.java))
    }
  }
}