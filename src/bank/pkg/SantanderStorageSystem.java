package bank.pkg;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SantanderStorageSystem implements StorageSystem{
    private SantanderBank bank;
    private SantanderStorage storage;
    public SantanderStorageSystem(SantanderBank bank,SantanderStorage storage){
        this.bank = bank;
        this.storage = storage;
        bank.setStorageSystem(this);
    }
    @Override
    public void performBackup() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        this.storage.getAccounts().forEach((key, value) -> {
            executorService.submit(new SantanderBackupOperation(this.storage,key,value));
        });
    }

    @Override
    public void performOperation(SantanderUpdateOperation operation) {
        Thread updateOperation = new Thread(operation,"update operation");
        updateOperation.start();
    }

    public SantanderUpdateOperation createUpdateOperation(int key,int value){
        return new SantanderUpdateOperation(this.storage,key,value);
    }
}
