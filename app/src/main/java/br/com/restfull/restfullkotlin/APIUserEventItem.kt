package br.com.restfull.restfullkotlin

data class APIUserEventItem(
    val actor: Actor,
    val created_at: String,
    val id: String,
    val org: Org,
    val payload: Payload,
    val `public`: Boolean,
    val repo: RepoXX,
    val type: String
)