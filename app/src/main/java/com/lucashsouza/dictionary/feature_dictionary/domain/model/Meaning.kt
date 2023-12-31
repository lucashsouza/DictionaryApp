package com.lucashsouza.dictionary.feature_dictionary.domain.model

import com.lucashsouza.dictionary.feature_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)
