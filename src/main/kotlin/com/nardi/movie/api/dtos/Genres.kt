package com.nardi.movie.api.dtos

import com.fasterxml.jackson.annotation.JsonProperty


data class Genres(

    @JsonProperty("id") var id: Int? = null,
    @JsonProperty("name") var name: String? = null

)