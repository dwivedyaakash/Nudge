package com.github.dwivedyaakash.nudge

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform