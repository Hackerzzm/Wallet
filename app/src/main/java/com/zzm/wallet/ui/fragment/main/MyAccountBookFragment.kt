package com.zzm.wallet.ui.fragment.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zzm.wallet.databinding.FragmentMyAccountBookBinding
import com.zzm.wallet.ui.activity.AccountBookActivity

class MyAccountBookFragment : Fragment() {
  private var _binding: FragmentMyAccountBookBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    super.onCreateView(inflater, container, savedInstanceState)
    _binding = FragmentMyAccountBookBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    initView()
  }

  private fun initView() {
    binding.goAccountBookActivity.setOnClickListener {
      AccountBookActivity.start(requireContext())
    }
  }
}