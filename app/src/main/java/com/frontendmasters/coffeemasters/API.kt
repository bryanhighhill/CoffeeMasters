package com.frontendmasters.coffeemasters

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CoffeeMastersApiService { //create function fetchMenu, annotate function saying going to get web service using GET method menu.json at baseURL provided in object API
    @GET("menu.json")
    suspend fun fetchMenu(): List<Category> //suspend core routine - mechanism that makes modern way to work with threading and multi tasking - asynchronous
}

object API {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://firtman.github.io/coffeemasters/api/")//json to be consumed
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val menuService: CoffeeMastersApiService by lazy {
        retrofit.create(CoffeeMastersApiService::class.java)
    }
}