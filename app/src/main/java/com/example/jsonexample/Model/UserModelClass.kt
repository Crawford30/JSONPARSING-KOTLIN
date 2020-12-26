package com.example.jsonexample.Model



//1. using data class
data class Users(
    val users: ArrayList<UserModelClass>
)

data class UserModelClass(
    val id: Int,
    val name: String,
    val email: String,
    val gender: String,
    val weight: Double,
    val height: Int,
    val phone: Phone
)

data class Phone(
    val mobile: String,
    val office: String
)

//2. using generic class

//class UserModelClass (
//    val id: Int,
//    val name: String,
//    val email: String,
//    val gender: String,
//    val weight: Double,
//    val height: Int,
//    val mobile: String,
//    val office: String
//)