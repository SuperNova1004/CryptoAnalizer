package ru.javarush.bogatov.cryptoanalizer.commands;

import ru.javarush.bogatov.cryptoanalizer.entity.Result;
import ru.javarush.bogatov.cryptoanalizer.entity.ResultCode;

public class Encoder implements Action {


    @Override
    public Result execute(String[] parameters) {
        // TODO something do
        return new Result("encode all right", ResultCode.OK);
    }
}
