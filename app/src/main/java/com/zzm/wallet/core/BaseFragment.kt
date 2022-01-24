package com.zzm.wallet.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zzm.wallet.db.AppDatabase

open class BaseFragment : Fragment() {
  protected lateinit var dbInstance: AppDatabase
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    super.onCreateView(inflater, container, savedInstanceState)
    dbInstance = AppDatabase.getInstance(requireContext())!!
    return super.onCreateView(inflater, container, savedInstanceState)
  }
}