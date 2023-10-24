package com.carapase.Music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carapase.Music.model.Music;

public interface MusicRepository extends JpaRepository<Music,Integer> {
    
}
