package ru.javarush.bogatov.cryptoanalizer.commands;

import ru.javarush.bogatov.cryptoanalizer.entity.Result;

public interface Action {

    Result execute(String [] parameters);
}
