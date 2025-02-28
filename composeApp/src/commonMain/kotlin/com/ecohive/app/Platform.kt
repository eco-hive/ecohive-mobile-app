package com.ecohive.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform