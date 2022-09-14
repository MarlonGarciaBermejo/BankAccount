public class Main {
    public static void main(String[] args) {

        Acc salaryAccount = new Acc();
        Acc savingAccount = new Acc(1000.0);

        salaryAccount.deposit(100.0);
        savingAccount.deposit(200.0);

        Double money = salaryAccount.withdraw(5000.0);
        System.out.println(money);

        System.out.println(salaryAccount.getBalance());
        System.out.println(savingAccount.getBalance());
    }
}