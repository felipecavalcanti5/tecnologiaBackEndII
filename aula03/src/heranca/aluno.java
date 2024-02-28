package heranca;

public class aluno extends pessoa {
    int matricula;

    public aluno(String nome, String CPF, String data_nascimento, int matricula) {
        super(nome, CPF, data_nascimento);
        this.matricula = matricula;
    }
}
