package br.com.restfull.restfullkotlin

data class Actor(
    val avatar_url: String,
    val display_login: String,
    val gravatar_id: String,
    val id: Int,
    val login: String,
    val url: String
)