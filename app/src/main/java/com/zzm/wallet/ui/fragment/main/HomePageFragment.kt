package com.zzm.wallet.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zzm.wallet.core.BaseFragment
import com.zzm.wallet.databinding.FragmentHomePageBinding
import com.zzm.wallet.databinding.FragmentMineBinding

class HomePageFragment:BaseFragment() {
  private var _binding: FragmentHomePageBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    super.onCreateView(inflater, container, savedInstanceState)
    _binding = FragmentHomePageBinding.inflate(inflater, container, false)
    return binding.root
  }
}