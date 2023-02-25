public class App {
    public static void main(String[] args) throws Exception {
        var jogador = new Jogador("Richard"); // Qualquer objeto que instanciarmos podemos utilizar Var, pois ele vai saber o tipo dele

        jogador.receveDamage(10);
        System.out.println(jogador.getName());
        System.out.println(jogador.getHp());
        
    }
}
