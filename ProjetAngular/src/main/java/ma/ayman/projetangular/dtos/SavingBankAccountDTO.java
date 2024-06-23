package ma.ayman.projetangular.dtos;

import lombok.Data;
import ma.ayman.projetangular.enums.AccountStatus;
import java.util.Date;

@Data
public class SavingBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
