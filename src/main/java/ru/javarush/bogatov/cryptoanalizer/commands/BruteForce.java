package ru.javarush.bogatov.cryptoanalizer.commands;

import ru.javarush.bogatov.cryptoanalizer.entity.Result;
import ru.javarush.bogatov.cryptoanalizer.entity.ResultCode;

public class BruteForce implements Action {


    @Override
    public Result execute(String[] parameters) {
        // TODO something do
        return new Result("BruteForce completed", ResultCode.OK);
    }
}
