package org.dmb1227.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform