package ru.javarush.bogatov.cryptoanalizer;

import ru.javarush.bogatov.cryptoanalizer.entity.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}






//int key = 123; //<<<< args
//String text = "Привет медвед!"; //<<<< args
//String result = "......."; //<<<< args
