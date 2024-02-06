package ru.alishev.springcourse.lesson_9_10_11_12;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component

public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    //    @Override
//    public List<String> getSong() {
//        List<String> listClassicalMusic = new ArrayList<>();
//        listClassicalMusic.add("Hungarian Rhapsody");
//        listClassicalMusic.add("Moonlight");
//        listClassicalMusic.add("Morning");
//        return listClassicalMusic;
//    }
}
