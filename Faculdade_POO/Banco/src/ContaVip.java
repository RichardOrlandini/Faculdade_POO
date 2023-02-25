public class ContaVip extends Conta{
    private double limit;
 
    public ContaVip(int number, double balance, double limit) {
        super(number, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public double calculeteBalance(){
        return balance + limit;
    }

}
