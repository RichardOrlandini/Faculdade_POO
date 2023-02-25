public class Conta {
    private int number;
    protected double balance;


    public Conta(int number, double balance){
        this.number = number;
        this.balance = balance;
    }

    public double calculeteBalance(){
        return this.balance;
    }


}
