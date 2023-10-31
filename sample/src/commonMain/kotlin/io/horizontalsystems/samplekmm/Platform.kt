package io.horizontalsystems.samplekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform