import Models.Account;
import Models.Transaction;
import Models.TransactionType;
import Repositories.AccountRepository;
import Repositories.IdCounterRepository;
import Repositories.TransactionRepository;
import Services.AccountService;
import Services.IdCounterService;
import Services.TransactionService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IdCounterRepository idRepo = new IdCounterRepository();
        IdCounterService idService = new IdCounterService(idRepo);
        AccountRepository repo = new AccountRepository();
        AccountService aService = new AccountService(repo, idService);
        TransactionRepository trepo = new TransactionRepository();
        TransactionService tservice = new TransactionService(trepo, aService, idService);

        Transaction t1 = tservice.addTransaction(TransactionType.WITHDRAW, "Testing insufficient funds", 2L, 2L, 5000.1f);

        System.out.println(t1);

    }
}
