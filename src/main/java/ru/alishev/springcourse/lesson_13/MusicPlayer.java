package ru.alishev.springcourse.lesson_13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    private List<Music> listMusic = new ArrayList<>();
    public MusicPlayer(List<Music> listMusic){
        this.listMusic = listMusic;
    }
    public String playMusic(){
        Random r = new Random();
        int i = r.nextInt(3);

        return "Playing: " + listMusic.get(i).getSong();
    }

//    private Music music1;
//    private Music music2;
//
//    public MusicPlayer( @Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic")Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

//    public String playMusic(){
//        return "Playing: " + music1.getSong() + ", " + music2.getSong();
//    }
}
