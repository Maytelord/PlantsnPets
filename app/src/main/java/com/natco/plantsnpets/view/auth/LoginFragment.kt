package com.natco.plantsnpets.view.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.natco.plantsnpets.databinding.LoginFragmentBinding

class LoginFragment : Fragment()  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = LoginFragmentBinding.inflate(inflater, container, false)
        context ?: return binding.root




        return binding.root
    }
}