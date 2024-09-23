package com.ppg.day01;

import com.ppg.myclass.Animal;
import com.ppg.myclass.Cat;
import com.ppg.myclass.Dog;

public class Demo2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        Animal cat = new Cat();
        cat.eat();
    }
}
