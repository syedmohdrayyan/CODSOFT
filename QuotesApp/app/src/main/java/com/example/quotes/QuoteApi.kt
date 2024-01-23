package com.example.quotes

import okhttp3.Response
import retrofit2.http.GET

interface QuoteApi {
    @GET("random")
    suspend fun getRandomQuote() : retrofit2.Response<List<QuoteModel>>

}