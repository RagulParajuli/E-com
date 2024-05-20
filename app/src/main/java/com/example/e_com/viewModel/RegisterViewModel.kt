//package com.example.e_com.viewModel
//
//import androidx.lifecycle.ViewModel
//import com.example.e_com.data.User
//import com.example.e_com.util.Resource
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.FirebaseUser
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.MutableStateFlow
//import javax.inject.Inject
//
//@HiltViewModel
//class RegisterViewModel @Inject constructor( // daggerHilt will handel the dependency of this injection
//    private val firebaseAuth: FirebaseAuth
//): ViewModel(){
//
//    // Resource will be on loading state when creating new account
////    private val _register = MutableStateFlow<Resource<FirebaseUser>>(Resource.Loading())
//
//    val register : Flow<Resource<FirebaseUser>> = _register
//
//    // Creating new Account in firebase
//        fun createAccountEmailandPassword(user: User, password: String){
//
//            firebaseAuth.createUserWithEmailAndPassword(user.email, password) // creating new email and password
//                .addOnSuccessListener {
//                    it.user?.let { // user can be null
//                        _register.value = Resource.Success(it)  // passing the success value from Resource class
//                    }
//                }
//                .addOnFailureListener{
//                    _register.value = Resource.Error(it.message.toString())  // passing the error value from Resource class
//                }
//        }
//}