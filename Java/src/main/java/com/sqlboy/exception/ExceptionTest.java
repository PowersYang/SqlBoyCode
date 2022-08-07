package com.sqlboy.exception;

public class ExceptionTest {
    public static void main(String[] args) throws MyException {
        // pass
        throw new MyException("imei号不符合业务规则");
    }

}

class MyException extends Exception {

    private static final long serialVersionUID = -557698798856068164L;

    public MyException() {
        super();
    }

    public MyException(String msg) {
        super(msg);
    }
}

