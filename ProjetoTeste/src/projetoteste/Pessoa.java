package projetoteste;

public class Pessoa {
    private int codpessoa;
    private String nome;
    private String cpf;
    private int idade;
    private String endereco;
    private int rg;


    public Pessoa(int codpessoa, String nome, String cpf, int idade, int rg) {
        this.codpessoa = codpessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodpessoa() {
        return codpessoa;
    }

    public void setCodpessoa(int codpessoa) {
        this.codpessoa = codpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
