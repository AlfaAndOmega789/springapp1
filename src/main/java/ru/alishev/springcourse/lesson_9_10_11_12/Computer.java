package ru.alishev.springcourse.lesson_9_10_11_12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.id  = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer +
                '}';
    }
}
