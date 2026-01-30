class BankService {
    int balance = 1000;   // initial balance

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankService b = new BankService();

        b.showBalance();     // before
        b.deposit(600);      // add money
        b.withdraw(200);     // take money
        b.showBalance();     // after
    }
}
