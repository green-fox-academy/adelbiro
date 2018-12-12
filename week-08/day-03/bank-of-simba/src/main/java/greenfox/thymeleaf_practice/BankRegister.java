package greenfox.thymeleaf_practice;

import java.util.ArrayList;
import java.util.List;

public class BankRegister {
  List<BankAccount> accountList;

  public BankRegister() {
    accountList = new ArrayList<>();
    accountList.add(new BankAccount("Simba", 2000, "lion"));
    accountList.add(new BankAccount("timon", 130, "szurikata"));
  }

  public List<BankAccount> getAccountList() {
    return accountList;
  }

}
