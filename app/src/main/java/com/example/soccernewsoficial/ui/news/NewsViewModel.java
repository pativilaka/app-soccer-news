package com.example.soccernewsoficial.ui.news;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernewsoficial.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO remover mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem Desfalque Importante","It is a long established fact that a reader will be distracted by th."));
        news.add(new News("Ferrinha Joga Sábado","Of type and scrambled it to make a type specimen book. It has survived not only five centuries."));
        news.add(new News("Copa do Mundo 2022","There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour."));

        this.news.setValue(news);
    }

    public MutableLiveData<List<News>> getNews() {

        return this.news;
    }
}