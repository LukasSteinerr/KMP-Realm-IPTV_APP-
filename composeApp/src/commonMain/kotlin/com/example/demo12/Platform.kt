package com.example.demo12

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform