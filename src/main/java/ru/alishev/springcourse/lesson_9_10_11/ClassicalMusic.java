package ru.alishev.springcourse.lesson_9_10_11;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    @Override
    public List<String> getSong() {
        List<String> listClassicalMusic = new ArrayList<>();
        listClassicalMusic.add("Hungarian Rhapsody");
        listClassicalMusic.add("Moonlight");
        listClassicalMusic.add("Morning");
        return listClassicalMusic;
    }
}
