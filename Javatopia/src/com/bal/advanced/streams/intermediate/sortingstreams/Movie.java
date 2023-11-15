package com.bal.advanced.streams.intermediate.sortingstreams;

public class Movie implements Comparable<Movie>{
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }
}
