package ru.alishev.springcourse.lesson_9_10_11;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> listRockMusic = new ArrayList<>();
        listRockMusic.add("Wind cries Mary");
        listRockMusic.add("Smoke on the Water");
        listRockMusic.add("Smells Like Teen Spirits");
        return listRockMusic;
    }
}
