package DTO;

public class Livro {
    private String nome;
    private String autor;
    private int qtdPaginas;
    private String editora;

    public Livro(String nome, String autor, int qtdPaginas, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }
}
