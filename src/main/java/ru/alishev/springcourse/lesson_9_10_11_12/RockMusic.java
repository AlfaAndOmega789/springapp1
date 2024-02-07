package ru.alishev.springcourse.lesson_9_10_11_12;

import org.springframework.stereotype.Component;

//@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
    //    @Override
//    public List<String> getSong() {
//        List<String> listRockMusic = new ArrayList<>();
//        listRockMusic.add("Wind cries Mary");
//        listRockMusic.add("Smoke on the Water");
//        listRockMusic.add("Smells Like Teen Spirits");
//        return listRockMusic;
//    }
}
