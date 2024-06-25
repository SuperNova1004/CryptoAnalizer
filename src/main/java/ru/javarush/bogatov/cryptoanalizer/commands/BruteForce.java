package ru.javarush.bogatov.cryptoanalizer.commands;

import ru.javarush.bogatov.cryptoanalizer.entity.Result;
import ru.javarush.bogatov.cryptoanalizer.entity.ResultCode;

public class BruteForce implements Action {


    @Override
    public Result execute(String[] parameters) {
        // TODO something do
        // видимо, тут и нужно "накидывать мясо" для решения задачи
        return new Result("BruteForce completed", ResultCode.OK);
    }
}
