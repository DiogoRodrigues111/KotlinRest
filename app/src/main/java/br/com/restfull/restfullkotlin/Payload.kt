package br.com.restfull.restfullkotlin

data class Payload(
    val action: String,
    val pull_request: PullRequest,
    val review: Review
)