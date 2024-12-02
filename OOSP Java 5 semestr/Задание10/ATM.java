class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println("Снято: " + amount);
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }

    public void checkBalance() {
        System.out.println("Текущий баланс: " + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Пополнено: " + amount);
    }
}
