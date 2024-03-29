package ru.alishev.springcourse.lesson_2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println("testBean.getName() = " + testBean.getName());

        context.close();
    }
}
