package bank.pkg;

public class WithdrawalTransaction implements Transaction,Runnable{
    @Override
    public void processTransaction() {
    // perform business logic of the transaction
    }

    @Override
    public void run() {
    // run thread that executes operation
    }
}
