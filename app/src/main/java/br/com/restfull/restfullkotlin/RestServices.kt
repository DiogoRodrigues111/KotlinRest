package br.com.restfull.restfullkotlin

import retrofit2.Call
import retrofit2.http.GET

interface RestServices
{
    @GET("events")
    fun listsUsers(): Call<List<Base>>
}