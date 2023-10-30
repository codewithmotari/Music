package com.carapase.Music.model;

import java.util.ArrayList;
import java.util.Set;

import jakarta.persistence.*;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String atrtist_name;
    @ManyToMany(mappedBy = "artists")
    private Set<Music> music;
}
