package com.nardi.movie.controllers

import com.nardi.movie.api.dtos.TopRatedMoviesDTO
import com.nardi.movie.api.gateway.MovieDBGateway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movie")
class MovieController {
    @Autowired
    val gateway = MovieDBGateway()

    @GetMapping("/top-rated")
    fun topRatedMovies(): TopRatedMoviesDTO? {
        return gateway.getTopRatedMovies()
    }
}