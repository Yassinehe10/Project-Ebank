package org.sid.projectbank.exceptions;

public class ClientNotFoundException extends Exception {
    public ClientNotFoundException(String clientNotFound) {
        super(clientNotFound);
    }
}
