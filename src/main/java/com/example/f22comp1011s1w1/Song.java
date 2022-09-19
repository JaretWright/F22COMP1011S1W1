package com.example.f22comp1011s1w1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Song {
    private String name, genre;
    private int length, releaseYear;
    private Artist artist;

    public Song(String name, String genre, int length, int releaseYear, Artist artist) {
        setName(name);
        setGenre(genre);
        setLength(length);
        setReleaseYear(releaseYear);
        setArtist(artist);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim();  //remove any leading or trailing whitespaces
        if (name.length()>0)
            this.name = name;
        else
            throw new IllegalArgumentException("Name must have at least 1 character");
    }

    public String getGenre() {
        return genre;
    }

    /**
     * This method will return a list of valid music genres
     */
    public static List<String> getGenres()
    {
        List<String> validGenres = Arrays.asList("pop","rock","soul","jazz",
                "metal","punk","country","electronic","dance","classical",
                "rhythm and blues","folk");

        Collections.sort(validGenres);
        return validGenres;
    }

    /**
     * Validate the genre passed in as an argument is part of the list
     * of valid genres and set the instance variable
     * @param genre
     */
    public void setGenre(String genre) {
        genre = genre.toLowerCase();

        if (getGenres().contains(genre))
            this.genre = genre;
        else
            throw new IllegalArgumentException(genre + " must be from the " +
                    "list of "+getGenres());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
