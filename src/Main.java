import bank.pkg.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

        // testing transactionSystem to Customer interoperability
        SantanderBank bank = new SantanderBank("Santander","UK");
        SantanderTransactionSystem transactionSystem = new SantanderTransactionSystem(bank);
        SantanderCustomer customer = new SantanderCustomer("Marek",1,transactionSystem);
        System.out.println(customer.getId());

        Map<Integer,Integer> accounts = new ConcurrentHashMap<Integer,Integer>();
        Map<Integer,Integer> backup = new ConcurrentHashMap<Integer,Integer>();

        for (int i = 0; i<1000;i++){
            accounts.put(i,0);
            backup.put(i,0);
        }

        SantanderStorage storage = new SantanderStorage(accounts,backup);
        SantanderStorageSystem storageSystem= new SantanderStorageSystem(bank,storage);


        customer.deposit(2000);
        storageSystem.performBackup();


    }
}