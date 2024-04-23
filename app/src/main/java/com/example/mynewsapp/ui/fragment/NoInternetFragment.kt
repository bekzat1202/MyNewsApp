package com.myself223.mynewsapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.myself223.mynewsapp.databinding.FragmentNoInternetBinding
import com.myself223.mynewsapp.ui.isNetworkAvailable


class NoInternetFragment : Fragment() {
    private val binding:FragmentNoInternetBinding by lazy {
        FragmentNoInternetBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCheck.setOnClickListener{
            if (!isNetworkAvailable(requireContext())) {
                Toast.makeText(requireContext(),"Все еще нет интеренета",Toast.LENGTH_SHORT).show()


            }else{
                findNavController().navigateUp()

            }



        }
    }

}