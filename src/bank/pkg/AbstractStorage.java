package bank.pkg;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStorage {
    private Map<Integer,Integer> accounts = new HashMap<Integer, Integer>();
    private Map<Integer,Integer> backup = new HashMap<Integer, Integer>();

    public AbstractStorage(Map<Integer, Integer> accounts, Map<Integer, Integer> backup) {
        this.accounts = accounts;
        this.backup = backup;
    }
}
