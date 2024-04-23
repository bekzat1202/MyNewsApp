package com.saliev1353.newsApp.ui.fragment

import com.myself223.mynewsapp.core.BaseFragment
import com.myself223.mynewsapp.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override fun getViewBinding(): FragmentProfileBinding = FragmentProfileBinding.inflate(layoutInflater)
}