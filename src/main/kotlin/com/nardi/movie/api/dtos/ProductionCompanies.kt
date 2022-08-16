package com.nardi.movie.api.dtos

import com.fasterxml.jackson.annotation.JsonProperty


data class ProductionCompanies(

    @JsonProperty("id") var id: Int? = null,
    @JsonProperty("logo_path") var logoPath: String? = null,
    @JsonProperty("name") var name: String? = null,
    @JsonProperty("origin_country") var originCountry: String? = null

)