package com.zzm.wallet.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zzm.wallet.core.BaseFragment
import com.zzm.wallet.databinding.FragmentAccountBinding
import com.zzm.wallet.ui.activity.newAccount.NewAccountActivity

/**
 * 账户分页
 */
class AccountFragment:BaseFragment() {
  private var _binding: FragmentAccountBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    super.onCreateView(inflater, container, savedInstanceState)
    _binding = FragmentAccountBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    initView()
    initEvent()
  }

  private fun initEvent() {
    binding.efab.setOnClickListener{
      NewAccountActivity.start(requireContext())
    }
  }

  private fun initView() {

  }
}