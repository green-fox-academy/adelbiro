package greenfox.thymeleaf_practice;

import java.util.ArrayList;
import java.util.List;

public class BankRegister {
  List<BankAccount> accountList;

  public BankRegister() {
    accountList = new ArrayList<>();
    accountList.add(new BankAccount("Simba", 2000, "lion"));
    accountList.add(new BankAccount("Pumba", 600, "warthog"));
    accountList.add(new BankAccount("Timon", 100, "meerkat"));
    accountList.add(new BankAccount("Nala", 1400, "lion"));
    accountList.add(new BankAccount("Mufasa", 6000, "lion king", true));
    accountList.add(new BankAccount("Scar", 4000, "lion", false, false));
  }

  public List<BankAccount> getAccountList() {
    return accountList;
  }

  public void addAccount(BankAccount newAccount) {
    accountList.add(newAccount);
  }

  public void incrementBalance(String accountName) {
    BankAccount account = convertName(accountName);
    if (account.isKingBoolean()) {
      account.setBalance(account.getBalance()+100);
    } else {
      account.setBalance(account.getBalance()+10);
    }
  }

  private BankAccount convertName(String accountName) {
    for (BankAccount account: accountList) {
      if (account.getName().equals(accountName))
        return account;
    }
    return null;
  }
}
