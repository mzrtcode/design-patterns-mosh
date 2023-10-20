package com.codewithmosh.chainOfResponsability;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);

    }

    public void log(HttpRequest request) {
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}
