package produtos;

public class Livro extends Product{

    private String autor;

    public Livro(String name, int preco, String autor) {
        super(name, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
