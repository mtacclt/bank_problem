package bank.pkg;

public class DepositTransaction implements Transaction,Runnable{
    @Override
    public void processTransaction() {
    // perform business logic of the transaction
    }

    @Override
    public void run() {
    // run thread that processes the transaction
    }
}
