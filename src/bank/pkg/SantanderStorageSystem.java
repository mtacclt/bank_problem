package bank.pkg;

import java.util.Map;

public class SantanderStorageSystem implements StorageSystem{
    private SantanderBank bank;
    private SantanderStorage storage;
    public SantanderStorageSystem(SantanderBank bank,SantanderStorage storage){
        this.bank = bank;
        this.storage = storage;
    }
    @Override
    public void performOperation(SantanderBackupOperation operation) {
        Thread backupOperation = new Thread(operation,"backup operation");
        backupOperation.start();
    }

    @Override
    public void performOperation(SantanderUpdateOperation operation) {
        Thread updateOperation = new Thread(operation,"update operation");
        updateOperation.start();
    }

    public SantanderUpdateOperation createUpdateOperation(int key,int value){
        return new SantanderUpdateOperation(this.storage);
    }

    public SantanderBackupOperation createBackupOperation(Map<Integer, Integer> accounts, Map<Integer, Integer> backup){
        return new SantanderBackupOperation(this.storage,accounts,backup);
    }
}
