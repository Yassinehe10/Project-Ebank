package org.sid.projectbank.sevices;

import org.sid.projectbank.dtos.*;
import org.sid.projectbank.exceptions.BankAccountNotFound;
import org.sid.projectbank.exceptions.ClientNotFoundException;
import org.sid.projectbank.exceptions.InsufficientBalanceException;

import java.util.List;

public interface BankAccountService {
    ClientDTO saveClient(ClientDTO clientDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft , Long clientID) throws ClientNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate , Long clientID) throws ClientNotFoundException;
    List<ClientDTO> listClients();
    BankAccountDTO getBankAccount(String accountID) throws BankAccountNotFound;
    void debit(String accountID, double amount, String description) throws BankAccountNotFound, InsufficientBalanceException;
    void credit(String accountID, double amount, String description) throws  BankAccountNotFound;
    void transfer(String fromAccountID, String toAccountID, double amount) throws InsufficientBalanceException, BankAccountNotFound;
    List<BankAccountDTO> listBankAccounts();

    ClientDTO getClientById(Long clientID) throws ClientNotFoundException;

    ClientDTO updateClient(ClientDTO clientDTO);

    void deleteClient(Long clientID);

    List<AccountOperationDTO> accountOperationHistory(String accountID);

    AccountHistoryDTO getAccountHistory(String accountID, int page, int size) throws BankAccountNotFound;

    List<ClientDTO> searchClients(String keyword);
}
