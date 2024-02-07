package ru.alishev.springcourse.lesson_13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:music/musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }
    @Bean
    public List<Music> listMusic(){
        List<Music> listMusic = new ArrayList<>();
        listMusic.add(classicalMusic());
        listMusic.add(rockMusic());
        listMusic.add(popMusic());

        return listMusic;
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(listMusic());
    }
}
//    @Bean
//    public MusicPlayer musicPlayer(){
//        return new MusicPlayer(classicalMusic(), rockMusic());
//    }
//    @Bean
//    public Computer computer(){
//        return new Computer(musicPlayer());
//    }
//}
