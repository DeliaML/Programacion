package Tema4;

public class Cuenta {

    private int account;
    private int money;

    public Cuenta() {

        this.account = 0;
        this.money = 0;
    }

    public Cuenta(int account, int money) {

        this.account = account;
        this.money = money;
    }

    public int getAccount() {
        return account;
    }

    public int getMoney() {
        return money;
    }

    public void setAccount(int account) {
        if (account >= 0) this.account = account;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void showAccount(int money) {

        System.out.println("Tienes " + money + " de dinero en tu cuenta");
    }

    public void recibirAbono(int bonus) {

        money += bonus;
    }

    public void reciboPagar(int bill) {

        money -= bill;
    }

    public void transferenciaCuenta(Cuenta sum, int res) {

        reciboPagar(res);
        sum.recibirAbono(res);
    }
}
