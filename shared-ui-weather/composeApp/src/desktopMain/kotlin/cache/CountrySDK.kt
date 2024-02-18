package cache

import java.io.File

actual fun pathToCountryCache(): String {
    val homeDir = System.getProperty("user.home")
    val cacheFile = "country_cache.json"
    val path = "$homeDir${File.separator}$cacheFile"

    println("Caching information at $path")

    return path
}