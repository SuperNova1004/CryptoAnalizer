package ru.javarush.bogatov.cryptoanalizer.controllers;

import ru.javarush.bogatov.cryptoanalizer.commands.Action;
import ru.javarush.bogatov.cryptoanalizer.commands.Decoder;
import ru.javarush.bogatov.cryptoanalizer.commands.Encoder;
import ru.javarush.bogatov.cryptoanalizer.exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName){
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            Action action = value.action;
            return action;
        } catch (IllegalArgumentException e) {
            throw new AppException();
        }
    }
}
