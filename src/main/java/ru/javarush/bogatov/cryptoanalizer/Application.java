package ru.javarush.bogatov.cryptoanalizer;

import ru.javarush.bogatov.cryptoanalizer.controllers.MainController;
import ru.javarush.bogatov.cryptoanalizer.entity.Result;
import ru.javarush.bogatov.cryptoanalizer.exceptions.AppException;

import java.util.Arrays;


public class Application {

    private final MainController mainController;
    public Application() {

        mainController = new MainController();

    }

    public Result run(String[] args) {
        Result result = null;
        if (args.length>0) {
            String action = args[0]; // encode
            // parameters - text.txt encode.txt 12
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            result = mainController.doAction(action, parameters);
        } else {
            throw new AppException();
        }
        return result;
    }
}
