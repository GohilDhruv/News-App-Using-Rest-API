package com.example.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String BASE_URL = "https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<MainNews> getNews(
            @Query("country") String country,
            @Query("pageSize") Integer pagesize,
            @Query("apiKey") String apikey
    );
    @GET("top-headlines")
    Call<MainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") Integer pagesize,
            @Query("apiKey") String apikey
    );
}
