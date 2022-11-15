package bank.pkg;

public class SantanderCustomer extends AbstractCustomer{
    private String name;
    private int id;

    private SantanderTransactionSystem transactionSystem;

    public SantanderCustomer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public SantanderCustomer(String name, int id,SantanderTransactionSystem transactionSystem) {
        this.id = id;
        this.name = name;
        this.transactionSystem = transactionSystem;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void deposit(int value){
        this.transactionSystem.createTransaction(1,id,value);
    }

    public void withdraw(int value){
        this.transactionSystem.createTransaction(2,this.id,value);
    }


}
