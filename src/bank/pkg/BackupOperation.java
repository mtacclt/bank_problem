package bank.pkg;

public class BackupOperation implements Operation,Runnable{
    @Override
    public void processOperation() {
    // perform business logic of the operation
    }
    @Override
    public void run() {
    // run thread that processes the Operation
    }
}
