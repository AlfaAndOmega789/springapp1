package ru.alishev.springcourse.lesson_9_10_11_12;

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

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class); //спросить , не понимаю
//        System.out.println("musicPlayer.playMusic(GenreMusic.CLASSICAL) = " + musicPlayer.playMusic(GenreMusic.CLASSICAL));

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//
//        System.out.println(classicalMusic1 == classicalMusic2);
        System.out.println(musicPlayer.playMusic());
        context.close();
    }
}
