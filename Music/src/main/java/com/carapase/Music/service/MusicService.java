package com.carapase.Music.service;

import java.util.List;
import com.carapase.Music.model.Music;

public interface MusicService {
    //save music
    Music saveMusic(Music music);
    //view all music
    List<Music> geList();

    //update music
    Music updateMusic(Music music,int id);

    //delete music
    void deleteMusicbyId(int id);

}
