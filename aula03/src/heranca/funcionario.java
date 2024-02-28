package heranca;

public class funcionario extends pessoa{
    double salario;
    String data_admissao;
    String cargo;

    public funcionario(String nome, String CPF, String data_nascimento) {
        super(nome, CPF, data_nascimento);
        this.salario = salario;
        this.data_admissao = data_nascimento;
        this.cargo = cargo;
    }
}
