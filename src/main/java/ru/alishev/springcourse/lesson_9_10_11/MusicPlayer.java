package ru.alishev.springcourse.lesson_9_10_11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }
    public String playMusic(GenreMusic genreMusic){
        String str = null;
        Random r = new Random();
        int randomValue = r.nextInt(3) + 1;

        if(genreMusic.equals(GenreMusic.ROCK)){
            str =  "Playing: " + music1.getSong().get(randomValue);
        }
        if (genreMusic.equals(GenreMusic.CLASSICAL)){
            str = "Playing: " + music2.getSong().get(randomValue);
        }
        return str;
    }
}
