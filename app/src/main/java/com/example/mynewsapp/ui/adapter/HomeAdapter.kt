package com.myself223.mynewsapp.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.myself223.mynewsapp.data.model.ArticlesDto
import com.myself223.mynewsapp.databinding.ItemNewsBinding
import com.myself223.mynewsapp.ui.fragment.HomeFragment

class HomeAdapter(homeFragment: HomeFragment) : ListAdapter<ArticlesDto, HomeAdapter.HomeViewHolder>(HomeDiffUtill()) {
    class HomeViewHolder (private val binding: ItemNewsBinding) : ViewHolder(binding.root) {
        fun onBind(it : ArticlesDto?){
            binding.postAuthor.text = it?.author
            binding.postData.text = it?.publishedAt
            binding.postName.text = it?.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(ItemNewsBinding.inflate(LayoutInflater.from(parent.context) , parent , false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val homeModel = getItem(position)
        holder.onBind(homeModel)
    }

    class HomeDiffUtill : DiffUtil.ItemCallback<ArticlesDto>(){

        override fun areItemsTheSame(oldItem: ArticlesDto, newItem: ArticlesDto): Boolean {
          return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ArticlesDto, newItem: ArticlesDto): Boolean {
            return oldItem == newItem
        }
    }
}


