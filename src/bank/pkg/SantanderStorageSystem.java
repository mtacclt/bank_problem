package bank.pkg;

public class SantanderStorageSystem implements StorageSystem{
    private SantanderBank bank;
    private SantanderStorage storage;
    public SantanderStorageSystem(SantanderBank bank,SantanderStorage storage){
        this.bank = bank;
        this.storage = storage;
    }
    @Override
    public void performOperation(Object operation) {
        //    if (obj instanceof C) {
        ////your code
        //    }
    }
}
