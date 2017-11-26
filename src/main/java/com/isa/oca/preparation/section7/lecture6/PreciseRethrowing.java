package com.isa.oca.preparation.section7.lecture6;

public class PreciseRethrowing {

    static class FirstException extends Exception {

    }

    static class SecondException extends Exception {

    }

    public void rethrowException(int count) throws Exception {
        try {
            if (count == 1) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void rethrowExceptionPrecise(int count) throws FirstException, SecondException {
        try {
            if (count == 1) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void rethrowExceptionRule(int count) throws Exception {
        try {
            if (count == 1) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
            e = new FirstException();
            throw e;
        }
    }
}
