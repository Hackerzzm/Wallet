package com.zzm.wallet.ui.fragment.accountbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zzm.wallet.core.BaseFragment
import com.zzm.wallet.databinding.FragmentAccountStatementBinding
import com.zzm.wallet.databinding.FragmentAssetBinding

class AccountStatementFragment: BaseFragment() {
  private var _binding: FragmentAccountStatementBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    super.onCreateView(inflater, container, savedInstanceState)
    _binding = FragmentAccountStatementBinding.inflate(inflater, container, false)
    return binding.root
  }
}