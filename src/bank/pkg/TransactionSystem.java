package bank.pkg;

public interface TransactionSystem {
    public void processTransaction(SantanderDepositTransaction transaction);

    public void processTransaction(SantanderWithdrawalTransaction transaction);
}
