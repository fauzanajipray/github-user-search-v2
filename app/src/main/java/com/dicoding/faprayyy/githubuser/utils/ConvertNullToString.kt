package com.dicoding.faprayyy.githubuser.utils

fun ConvertNullToString(string: String): String{
    if (string == "null"){
        return "-"
    }
    return string
}