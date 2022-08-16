package com.nardi.movie.api.dtos

import com.fasterxml.jackson.annotation.JsonProperty

data class Results(
    @JsonProperty("poster_path") var posterPath: String? = null,
    @JsonProperty("adult") var adult: Boolean? = null,
    @JsonProperty("overview") var overview: String? = null,
    @JsonProperty("release_date") var releaseDate: String? = null,
    @JsonProperty("genre_ids") var genreIds: ArrayList<Int> = arrayListOf(),
    @JsonProperty("id") var id: Int? = null,
    @JsonProperty("original_title") var originalTitle: String? = null,
    @JsonProperty("original_language") var originalLanguage: String? = null,
    @JsonProperty("title") var title: String? = null,
    @JsonProperty("backdrop_path") var backdropPath: String? = null,
    @JsonProperty("popularity") var popularity: Double? = null,
    @JsonProperty("vote_count") var voteCount: Int? = null,
    @JsonProperty("video") var video: Boolean? = null,
    @JsonProperty("vote_average") var voteAverage: Double? = null

)