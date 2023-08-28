import java.util.Arrays;

public class Midia {
    private int codigo;
    private String nome;
    private int ano;
    private String diretor;
    private String[] atores;

    public Midia() {
    }

    public Midia(int codigo, String nome, int ano, String diretor, String[] atores) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
        this.atores = atores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String[] getAtores() {
        return atores;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {
        return "Midia{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", ano=" + ano +
                ", diretor='" + diretor + '\'' +
                ", atores=" + Arrays.toString(atores) +
                '}';
    }
}
