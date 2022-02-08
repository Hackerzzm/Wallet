package com.zzm.wallet.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.zzm.wallet.R
import com.zzm.wallet.core.BaseActivity
import com.zzm.wallet.core.MyApplication
import com.zzm.wallet.databinding.ActivityMainBinding
import com.zzm.wallet.ui.fragment.main.AccountFragment
import com.zzm.wallet.ui.fragment.main.MaterialsFragment
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

  companion object {
    fun start(context: Context) {
      context.startActivity(Intent(context, MainActivity::class.java))
    }
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
        R.id.tab_account_page -> binding.viewPager2.setCurrentItem(0, true)
        R.id.tab_my_account_book -> binding.viewPager2.setCurrentItem(1, true)
        R.id.tab_materials_module -> binding.viewPager2.setCurrentItem(2, true)
        R.id.tab_mine -> binding.viewPager2.setCurrentItem(3, true)
      }
      true
    }
    binding.viewPager2.isUserInputEnabled = false //true:滑动，false：禁止滑动
  }

  val mainFragments = mutableListOf<Fragment>()
  private fun initFragments() {
    mainFragments.add(AccountFragment())
    mainFragments.add(MyAccountBookFragment())
    mainFragments.add(MaterialsFragment())
    mainFragments.add(MineFragment())
  }

  private var mExitTime: Long = 0
  override fun onKeyDown(
    keyCode: Int,
    event: KeyEvent?
  ): Boolean {
    if (keyCode == KeyEvent.KEYCODE_BACK) {
      if (System.currentTimeMillis() - mExitTime > 2000) {
        Toast.makeText(this, getString(R.string.press_again_to_exit_app), Toast.LENGTH_SHORT)
          .show()
        mExitTime = System.currentTimeMillis()
      } else {
        MyApplication.exit()
      }
      return true
    }
    return super.onKeyDown(keyCode, event)
  }
}