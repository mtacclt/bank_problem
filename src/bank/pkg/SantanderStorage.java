package bank.pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SantanderStorage extends AbstractStorage{

    private Map<Integer,Integer> accounts = new ConcurrentHashMap<Integer,Integer>();
    private Map<Integer,Integer> backup = new ConcurrentHashMap<Integer,Integer>();

    public SantanderStorage(Map<Integer, Integer> accounts, Map<Integer, Integer> backup) {
        this.accounts = accounts;
        this.backup = backup;
    }
    

    public Map<Integer, Integer> getAccounts() {
        return accounts;
    }

    public Map<Integer, Integer> getBackup() {
        return backup;
    }
}
