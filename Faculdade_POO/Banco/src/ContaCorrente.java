public class ContaCorrente extends Conta {
    
    private double rate;

    public ContaCorrente(int number, double balance, double rate) {
        super(number, balance);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
