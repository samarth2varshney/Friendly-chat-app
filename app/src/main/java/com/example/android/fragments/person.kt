package com.example.android.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.fragments.databinding.FragmentPersonBinding

class person : Fragment() {

    private var binding: FragmentPersonBinding? = null
    //private var binding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonBinding.inflate(layoutInflater)
        binding!!.button.setOnClickListener {
            binding!!.textView2.text = "hello"
        }

        return (binding!!.root)
    }

}