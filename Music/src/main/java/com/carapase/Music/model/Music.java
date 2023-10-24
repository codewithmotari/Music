package com.carapase.Music.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Artist artist=new Artist();
    private double duration;
    private Genre music_genre;

    enum Genre{
        POP,
        REGGEA,
        BONGO
    }
    
    public Music(){}

    public Music(String name,Artist artist,double duration ,Genre genre){
        this.name=name;
        this.artist=artist;
        this.duration=duration;
        this.music_genre=genre;
    }
    public void setArtist(Artist artist){
        this.artist=artist;
    }
    public Artist getArtist(){
        return artist;
    }

        public void setDuration(double duration){
        this.duration=duration;
    }
    public double getDuration(){
        return duration;
    }

    public void setGenre(Genre genre){
        this.music_genre=genre;
    }
    public Genre getGenre(){
        return music_genre;
    }
    
}
