public class Jogador {
    private String name;
    private int xp = 0;
    private int hp = 100;
    private boolean poisoned = false;

    public Jogador(){
    }

    public Jogador(String name){
        this.name = name;
    }

    public void receveDamage(int pontos){
        this.hp -= pontos;
    }

    public void receveCure(int pontos){
        this.hp += pontos;
    }

    public void toWinExperience(int pontos){
        this.xp += pontos;
    }

    public void receveAntidote(int pontos){
        poisoned = !poisoned;
    }

    

    public String getName() {
        return name;
    }

    public int getXp(){
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public boolean isPoisoned() {
        return poisoned;
    }


}
