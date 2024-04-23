package com.myself223.mynewsapp.ui.fragment

import com.myself223.mynewsapp.core.BaseFragment
import com.myself223.mynewsapp.databinding.FragmentFavoriteBinding

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding>() {
    override fun getViewBinding(): FragmentFavoriteBinding = FragmentFavoriteBinding.inflate(layoutInflater)
}