package com.example.e_com.fragment.LoginRegister


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.e_com.data.User
import com.example.e_com.util.Resource
//import com.example.e_com.viewModel.RegisterViewModel
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentRegisterBinding
//import dagger.hilt.android.AndroidEntryPoint


//private val TAG = "RegisterFragment"
//@AndroidEntryPoint
class RegisterFragment : Fragment(R.layout.fragment_register) {

//    private lateinit var binding: FragmentRegisterBinding
////    private val viewModel by viewModels<RegisterViewModel> ()
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        binding = FragmentRegisterBinding.inflate(inflater)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)

//        binding.apply {
//            btnRegister.setOnClickListener {
//                val user = User(
//                    edEmailRegister.text.toString().trim(),
//                    edLastNameRegister.text.toString().trim(),
//                    edEmailRegister.text.toString().trim()
//                )
//                val password = edPasswordRegister.text.toString()
//                viewModel.createAccountEmailandPassword(user, password)
//            }
//        }
//        lifecycleScope.launchWhenStarted {
////            viewModel.register.collect{
//                when(it){
//                    is Resource.Loading -> {
//                        binding.btnRegister.startAnimation(AnimationUtils.loadAnimation(requireContext(), R.anim.loading))
////                        requireContext() is a method provided by the Fragment class that returns the Context of the Fragment
//                    }
//                    is Resource.Success -> {
//                        Log.d("test", it.data.toString())
//                    }
//                    is Resource.Error -> {
//                        Log.e(TAG, it.message.toString())
//                    }
//                }
//            }
//        }
//    }
}


