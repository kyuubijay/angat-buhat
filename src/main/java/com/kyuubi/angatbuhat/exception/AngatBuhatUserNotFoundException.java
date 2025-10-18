package com.kyuubi.angatbuhat.exception;

public class AngatBuhatUserNotFoundException extends RuntimeException {
    public AngatBuhatUserNotFoundException(String userNotFound) {
        super(userNotFound);
    }
}
