package other;

public class Test {
    public static void main(String[] args) {

        Account ubs = new Account("UBS", 200);

        ubs.depositMoney(200);

        System.out.println(ubs);

        ubs.withdrawMoney(450);
    }
}
