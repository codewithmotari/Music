package com.carapase.Music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carapase.Music.model.Music;
import com.carapase.Music.repository.MusicRepository;

@Service
public class MusicServiceimpl implements MusicService{
    @Autowired 
    private MusicRepository musicRepository;

    @Override
    public Music saveMusic(Music music) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'saveMusic'");
        return musicRepository.save(music);
    }

    @Override
    public List<Music> geList() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'geList'");
        return (List<Music>)musicRepository.findAll();
    }

    @Override
    public Music updateMusic(Music music, int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateMusic'");
    }

    @Override
    public void deleteMusicbyId(int id) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteMusicbyId'");
        musicRepository.deleteById(id);
    }
    
}
