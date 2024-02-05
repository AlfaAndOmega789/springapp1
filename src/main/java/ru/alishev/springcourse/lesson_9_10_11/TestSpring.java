package ru.alishev.springcourse.lesson_9_10_11;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music1 = context.getBean("rockMusic", Music.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(music1);
//        rockMusicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", ClassicalMusic.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//        classicalMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = new MusicPlayer(); //спросить , не понимаю
        musicPlayer.playMusic(GenreMusic.CLASSICAL);


        context.close();
    }
}
