public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000.0); // Начальный баланс 1000
        ATM atm = new ATM(account);

        atm.checkBalance();      // Проверка баланса
        atm.withdraw(200.0);     // Снятие наличных
        atm.checkBalance();      // Проверка баланса
        atm.deposit(150.0);      // Пополнение счета
        atm.checkBalance();      // Проверка баланса
        atm.withdraw(1000.0);    // Попытка снять больше, чем есть на счете
    }
}