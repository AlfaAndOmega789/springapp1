package ru.alishev.springcourse.lesson_9_10_11;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
