package ru.alishev.springcourse.lesson_4_5_6_7_8;

public class RapMusic implements Music {
    public void doMyInit(){
        System.out.println("Doing my initialization ClassicalMusic");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction ClassicalMusic");
    }
    @Override
    public String getSong() {
        return "Moscow, Guf";
    }
}
