package com.dicky.themovies.model;

import com.google.gson.annotations.SerializedName;

public class Movie extends BaseModel<MovieData> {
    @SerializedName("total_results")
    public Integer total_results;

    public Movie() {
    }

    @SerializedName("total_pages")
    public Integer total_pages;

    public Integer getTotal_results() {
        return total_results;
    }

    public void setTotal_results(Integer total_results) {
        this.total_results = total_results;
    }

    public Integer getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(Integer total_pages) {
        this.total_pages = total_pages;
    }
}
