package bank.pkg;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractStorage {
    Map<Integer,Integer> accounts = new HashMap<Integer, Integer>();
    Map<Integer,Integer> backup = new HashMap<Integer, Integer>();
}
