package ru.alishev.springcourse.lesson_4_5_6_7_8;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    //IoC
    public MusicPlayer(List<Music> list){
        this.musicList = musicList;
    }
    public MusicPlayer(){}
    public void setMusicList(List<Music> musicList){
        this.musicList = musicList;
    }
    public void playMusic(){
        for(Music music : musicList)
            System.out.println("Playing: " + music.getSong());
    }
}
