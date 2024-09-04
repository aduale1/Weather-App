package com.example.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {

    @GET("weather?appid=b7c1dc9718ff383771c7864371cbac74&units=metric")
    Call<OpenWeatherMap>getWeatherWithLocation(@Query("lat")double lat,@Query("lon")double lon);

    @GET("weather?appid=b7c1dc9718ff383771c7864371cbac74&units=metric")
    Call<OpenWeatherMap>getWeatherWithCityName(@Query("q")String name);
}
