package com.lucashsouza.dictionary.feature_dictionary.data.remote

import com.lucashsouza.dictionary.feature_dictionary.data.remote.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    companion object {
        const val BASE_URL = "https://api.dictionaryapi.dev/"
    }

    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word : String
    ): List<WordInfoDto>

}