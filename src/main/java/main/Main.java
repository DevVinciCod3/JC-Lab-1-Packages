package main;
import packageone.ClassOne;
import packagetwo.ClassTwo;
import packagethree.ClassThree;


public class Main {
    public static void main(String[] args) {
        ClassOne class1 = new ClassOne();
        ClassTwo class2 = new ClassTwo();
        ClassThree class3 = new ClassThree();

        System.out.println(class1.greet());
        System.out.println(class2.greet());
        System.out.println(class3.greet());


    }
}