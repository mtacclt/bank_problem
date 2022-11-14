package bank.pkg;

import java.util.Map;

public class SantanderBackupOperation implements Operation,Runnable{

    private SantanderStorage storage;
    private Map<Integer,Integer> accounts;
    private Map<Integer,Integer> backupAccounts;

    public SantanderBackupOperation(SantanderStorage storage, Map<Integer, Integer> accounts, Map<Integer, Integer> backup) {
        this.storage = storage;
        this.accounts = accounts;
        this.backupAccounts = backup;
    }

    @Override
    public void runOperation() {
    // perform business logic of the operation
    }
    @Override
    public void run() {
    // run thread that processes the Operation
    }
}
