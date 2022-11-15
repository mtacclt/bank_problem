package bank.pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractStorage {
    private Map<Integer,Integer> accounts = new ConcurrentHashMap<Integer,Integer>();
    private Map<Integer,Integer> backup = new ConcurrentHashMap<Integer,Integer>();;

}
