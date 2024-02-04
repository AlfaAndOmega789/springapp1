package ru.alishev.springcourse.lesson_4_5_6_7_8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("classicalBean", ClassicalMusic.class);
//        RockMusic rockMusic = context.getBean("rockBean", RockMusic.class);
//        RapMusic rapMusic = context.getBean("rapBean", RapMusic.class);

        System.out.println(classicalMusic.getSong());
//        System.out.println(rockMusic.getSong());
//        System.out.println(rapMusic.getSong());
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean value = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(value);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());


//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}