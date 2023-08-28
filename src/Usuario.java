public class Usuario {

    private int id;
    private String nome;
    private Midia[] favoritos;

    public Usuario() {
    }

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Usuario(int id, String nome, Midia[] favoritos) {
        this.id = id;
        this.nome = nome;
        this.favoritos = favoritos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Midia[] getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Midia[] favoritos) {
        this.favoritos = favoritos;
    }
}
