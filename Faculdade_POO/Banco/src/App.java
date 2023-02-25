public class App {
    public static void main(String[] args) throws Exception {
        var conta =  new Conta(1234, 100);
        System.out.println(conta.calculeteBalance());

        var contaCorrente = new ContaCorrente(3214, 500, 10);
        System.out.println(contaCorrente.calculeteBalance());

        var contaVip = new ContaVip(4567, 200, 1000);
        System.out.println(contaVip.calculeteBalance());

        //o mesmo objeto assume formas diferentes para a mesma classe 


    }
}
