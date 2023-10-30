package com.carapase.Music.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String name;
    @ManyToMany
    @JoinTable(name = "music_artists",
            joinColumns = @JoinColumn(name = "music_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"))
    @Getter @Setter
    private Set<Artist> artists;
    @Getter @Setter
    private double duration;
    @Getter @Setter
    private Genre music_genre;
    @Lob @Getter @Setter
    private byte[] audio;

    enum Genre {
        POP,
        REGGEA,
        BONGO
    }

}
