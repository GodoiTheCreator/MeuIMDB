public class Usuario {

    private int id;
    private String nome;
    private Midia[] favoritos;
    private int tamanhoFavoritos;
    private final int MAX_FAVORITOS = 10;

    public Usuario() {
        this.favoritos = new Midia[MAX_FAVORITOS];
    }

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.favoritos = new Midia[MAX_FAVORITOS];
    }

    public Usuario(int id, String nome, Midia[] favoritos) {
        this.id = id;
        this.nome = nome;
        this.favoritos = favoritos;
    }

    public void adicionarMidia(Midia midia){
        favoritos[tamanhoFavoritos] = midia;
        tamanhoFavoritos++;
    }

    public void removerMidia(Midia midia){
        for(int i = 0; i<tamanhoFavoritos+1; i++){
            if(midia.getNome() == favoritos[i].getNome()){
                favoritos[i] = favoritos[tamanhoFavoritos];
                favoritos[tamanhoFavoritos] = null;
                return;
            }
        }
        System.out.println("Midia não encontrada na lista de favoritos.");
    }

    public void removerMidia(int idx){
        if(favoritos==null){
            System.out.println("Não ha midia nesta posicao da lista.");
            return;
        }
        favoritos[idx] = null;
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
