package com.nardi.movie.api.gateway

import com.nardi.movie.api.dtos.TopRatedMoviesDTO
import com.nardi.movie.config.MovieDBConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@Service
class MovieDBGateway {
    @Autowired
    val config = MovieDBConfig()

    fun getTopRatedMovies(): TopRatedMoviesDTO? {
        try {
            return RestTemplate().getForObject(
                buildRequest("top-rated", "pt-BR"),
                TopRatedMoviesDTO::class
            )
        } catch (e: HttpClientErrorException) {
            e.printStackTrace()
        }
        return null
    }

    private fun buildRequest(api: String, language: String = "en-US"): String {
        return config.address!! + config.apis.get(api) + "?api_key=${config.apiKey}&language=" + language
    }
}