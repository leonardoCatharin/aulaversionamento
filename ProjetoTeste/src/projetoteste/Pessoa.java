package projetoteste;

public class Pessoa {
    private int codpessoa;
    private String nome;
    private String cpf;

    public Pessoa(int codpessoa, String nome, String cpf) {
        this.codpessoa = codpessoa;
        this.nome = nome;
        this.cpf = cpf;
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
