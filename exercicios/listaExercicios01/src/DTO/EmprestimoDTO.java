package DTO;
public class EmprestimoDTO {
    private Cliente cliente;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public EmprestimoDTO(Cliente cliente, Livro livro, String dataEmprestimo, String dataDevolucao) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }

    public String getNomeLivro() {
        return livro.getNome();
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }
}
