package com.nardi.movie.api.dtos

import com.fasterxml.jackson.annotation.JsonProperty


data class ProductionCountries(

    @JsonProperty("iso_3166_1") var iso31661: String? = null,
    @JsonProperty("name") var name: String? = null

)