package com.imglmd.siftie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform