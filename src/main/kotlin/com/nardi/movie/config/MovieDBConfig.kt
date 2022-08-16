package com.nardi.movie.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("moviedb")
class MovieDBConfig {
    var apiKey: String? = null
    var address: String? = null
    var apis: Map<String, String> = HashMap()

    override fun toString(): String {
        return "{apiKey=$apiKey, address=$address, apis=$apis}"
    }
}