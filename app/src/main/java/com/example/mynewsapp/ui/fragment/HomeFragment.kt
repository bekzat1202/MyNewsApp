package com.myself223.mynewsapp.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.myself223.mynewsapp.R
import com.myself223.mynewsapp.core.BaseFragment
import com.myself223.mynewsapp.databinding.FragmentHomeBinding
import com.myself223.mynewsapp.ui.adapter.HomeAdapter
import com.saliev1353.newsApp.ui.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private var adapter:HomeAdapter? = null


    private val viewModel: MainViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = HomeAdapter(this)
    }


    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun constructListeners() {
        viewModel.getNews("Tesla", "business")
    }

}