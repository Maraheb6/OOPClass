import javax.naming.InsufficientResourcesException;

public class Account {
    private String id;
    private String name;
    private  int balance=0;
    public Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit(int amount)  {
        if(amount>balance){
            System.out.println("balance less than amount");
            //throw new InsufficientResourcesException("balance less than amount");
        }
        return balance-amount;
    }
    public int depit(int amount){
        return balance+amount;

    }
    public int transforTo(Account another,int amount) {
        if (amount > balance) {
            System.out.println("Balance less than amount");
        } else {
            another.balance += amount;
            balance -= amount;

        }
        return balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
