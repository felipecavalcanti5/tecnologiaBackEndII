package heranca;

public class professor extends pessoa{
    double salario;
    String disciplina;

    public professor(String nome, String CPF, String data_nascimento) {
        super(nome, CPF, data_nascimento);
        this.salario = salario;
        this.disciplina = disciplina;
    }
}
