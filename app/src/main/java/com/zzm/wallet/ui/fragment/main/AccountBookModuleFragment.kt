package com.zzm.wallet.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zzm.wallet.core.BaseFragment
import com.zzm.wallet.databinding.FragmentAccountBookModuleBinding

class AccountBookModuleFragment:BaseFragment() {
  private var _binding: FragmentAccountBookModuleBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    super.onCreateView(inflater, container, savedInstanceState)
    _binding = FragmentAccountBookModuleBinding.inflate(inflater, container, false)
    return binding.root
  }
}