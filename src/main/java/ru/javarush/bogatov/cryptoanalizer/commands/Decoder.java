package ru.javarush.bogatov.cryptoanalizer.commands;

import ru.javarush.bogatov.cryptoanalizer.entity.Result;
import ru.javarush.bogatov.cryptoanalizer.entity.ResultCode;

public class Decoder implements Action {


    @Override
    public Result execute(String[] parameters) {
        // TODO something do
        return new Result("decode all right", ResultCode.OK);
    }
}
