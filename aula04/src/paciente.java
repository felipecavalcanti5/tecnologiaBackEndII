public class paciente {
    private final String nome;
    private String cpf;
    private String dataNasc;
    private final int telefone;

    public paciente(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }
}
