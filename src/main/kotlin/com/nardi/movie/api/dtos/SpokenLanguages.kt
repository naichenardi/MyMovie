package com.nardi.movie.api.dtos

import com.fasterxml.jackson.annotation.JsonProperty


data class SpokenLanguages(

    @JsonProperty("iso_639_1") var iso6391: String? = null,
    @JsonProperty("name") var name: String? = null

)