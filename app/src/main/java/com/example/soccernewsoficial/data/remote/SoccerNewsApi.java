package com.example.soccernewsoficial.data.remote;

import com.example.soccernewsoficial.domain.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();

}
