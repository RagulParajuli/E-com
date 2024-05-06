package com.example.e_com.data

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    var imagePath: String = ""
)
{
    // App will get user data through constructor
    constructor() : this("","","","")
}
