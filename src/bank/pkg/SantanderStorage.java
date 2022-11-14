package bank.pkg;

import java.util.HashMap;
import java.util.Map;

public class SantanderStorage extends AbstractStorage{

    public Map<Integer, Integer> getAccounts() {
        return accounts;
    }
    private Map<Integer,Integer> accounts = new HashMap<Integer, Integer>();
    private Map<Integer,Integer> backup = new HashMap<Integer, Integer>();
    private SantanderStorageSystem storageSystem;

    public SantanderStorage(Map<Integer, Integer> accounts, Map<Integer, Integer> backup) {
        super(accounts, backup);
    }
    public SantanderStorage(Map<Integer, Integer> accounts, Map<Integer, Integer> backup, SantanderStorageSystem storageSystem) {
        super(accounts, backup);
        this.storageSystem = storageSystem;
    }

//    public void updateAccounts(int id,int value){
//
//    }


}
