package ma.ayman.projetangular.repositories;

import ma.ayman.projetangular.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
