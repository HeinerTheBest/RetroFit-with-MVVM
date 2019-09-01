package com.mobileapps.retrofitwithmvvm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api
{
    public String BASE_URL = "https://www.simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
