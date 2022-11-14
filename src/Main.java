import bank.pkg.SantanderBank;
import bank.pkg.SantanderCustomer;
import bank.pkg.SantanderStorage;
import bank.pkg.SantanderTransactionSystem;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // testing transactionSystem to Customer interoperability
        SantanderBank bank = new SantanderBank("Santander","UK");
        SantanderTransactionSystem transactionSystem = new SantanderTransactionSystem(bank);
        SantanderCustomer customer = new SantanderCustomer("Marek",23,transactionSystem);
        customer.deposit(1000);
        customer.withdraw(1000);

    }
}