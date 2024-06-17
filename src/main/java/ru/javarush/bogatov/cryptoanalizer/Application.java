package ru.javarush.bogatov.cryptoanalizer;

import ru.javarush.bogatov.cryptoanalizer.controllers.MainController;
import ru.javarush.bogatov.cryptoanalizer.entity.Result;
import ru.javarush.bogatov.cryptoanalizer.exception.AppException;

import java.util.Arrays;


public class Application {

    private final MainController mainController;
    public Application() {

        mainController = new MainController();

    }

    public Result run(String[] args) {

        if (args.length>0) {
            String action = args[0];
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            Result result = mainController.doAction(action, parameters);
        }
        throw new AppException();
    }
}