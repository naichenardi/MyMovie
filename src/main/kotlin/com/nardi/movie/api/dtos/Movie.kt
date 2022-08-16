package com.nardi.movie.api.dtos

import com.fasterxml.jackson.annotation.JsonProperty


data class Movie(
    @JsonProperty("id") var id: Int? = null,
    @JsonProperty("adult") var adult: Boolean? = null,
    @JsonProperty("backdrop_path") var backdropPath: String? = null,
    @JsonProperty("belongs_to_collection") var belongsToCollection: String? = null,
    @JsonProperty("budget") var budget: Int? = null,
    @JsonProperty("genres") var genres: ArrayList<Genres> = arrayListOf(),
    @JsonProperty("homepage") var homepage: String? = null,
    @JsonProperty("imdb_id") var imdbId: String? = null,
    @JsonProperty("original_language") var originalLanguage: String? = null,
    @JsonProperty("original_title") var originalTitle: String? = null,
    @JsonProperty("overview") var overview: String? = null,
    @JsonProperty("popularity") var popularity: Double? = null,
    @JsonProperty("poster_path") var posterPath: String? = null,
    @JsonProperty("production_companies") var productionCompanies: ArrayList<ProductionCompanies> = arrayListOf(),
    @JsonProperty("production_countries") var productionCountries: ArrayList<ProductionCountries> = arrayListOf(),
    @JsonProperty("release_date") var releaseDate: String? = null,
    @JsonProperty("revenue") var revenue: Int? = null,
    @JsonProperty("runtime") var runtime: Int? = null,
    @JsonProperty("spoken_languages") var spokenLanguages: ArrayList<SpokenLanguages> = arrayListOf(),
    @JsonProperty("status") var status: String? = null,
    @JsonProperty("tagline") var tagline: String? = null,
    @JsonProperty("title") var title: String? = null,
    @JsonProperty("video") var video: Boolean? = null,
    @JsonProperty("vote_average") var voteAverage: Double? = null,
    @JsonProperty("vote_count") var voteCount: Int? = null

)