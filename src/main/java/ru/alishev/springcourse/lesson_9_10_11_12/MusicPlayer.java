package ru.alishev.springcourse.lesson_9_10_11_12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
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
    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
//    public String playMusic(GenreMusic genreMusic){
//        String str = null;
//        Random r = new Random();
//        int randomValue = r.nextInt(2) + 1;
//
//        if(genreMusic.equals(GenreMusic.ROCK)){
//            str =  "Playing: " + music1.getSong().get(randomValue);
//        }
//        if (genreMusic.equals(GenreMusic.CLASSICAL)){
//            str = "Playing: " + music2.getSong().get(randomValue);
//        }
//        return str;
//    }
}
