package org.sid.projectbank.dtos;


import org.sid.projectbank.enums.AccountStatus;
import lombok.Data;

import java.util.Date;

@Data
public class SavingBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createAcc;
    private AccountStatus status;
    private ClientDTO clientDTO;
    private double interestRate;
}
