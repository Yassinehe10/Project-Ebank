package org.sid.projectbank.exceptions;

public class BankAccountNotFound extends Exception {
    public BankAccountNotFound(String bankAccountNotFound) {
        super(bankAccountNotFound);
    }
}