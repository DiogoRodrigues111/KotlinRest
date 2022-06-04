package br.com.restfull.restfullkotlin

data class Review(
    val _links: LinksX,
    val author_association: String,
    val body: Any,
    val commit_id: String,
    val html_url: String,
    val id: Int,
    val node_id: String,
    val pull_request_url: String,
    val state: String,
    val submitted_at: String,
    val user: UserXXX
)