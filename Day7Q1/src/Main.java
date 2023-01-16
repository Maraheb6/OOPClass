public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Account account=new Account("4419MA","Maraheb",1000);
        Account account1=new Account("4411","Haya",100);
        int credit = account.credit(100);
        System.out.println("balance: "+credit);
        int depit=account.depit(600);
        System.out.println("balance after deposit: "+depit);
        System.out.println("Your Balance after tansfor "+account.transforTo(account1,200));
        System.out.println(account.toString());

    }
}