package com.nardi.movie.api.dtos

import com.fasterxml.jackson.annotation.JsonProperty


data class TopRatedMoviesDTO(
    @JsonProperty("page") var page: Int? = null,
    @JsonProperty("results") var results: ArrayList<Results> = arrayListOf(),
    @JsonProperty("total_results") var totalResults: Int? = null,
    @JsonProperty("total_pages") var totalPages: Int? = null

)