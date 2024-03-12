package DTO;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String dataNascimento;
    private String telefone;

    public Cliente(String nome, String cpf, String endereco, String dataNascimento, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
}
