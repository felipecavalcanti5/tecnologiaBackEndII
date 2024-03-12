package DTO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro de clientes
        System.out.println("Cadastro de Cliente");
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpfCliente = scanner.nextLine();
        System.out.println("Digite o endereço do cliente:");
        String enderecoCliente = scanner.nextLine();
        System.out.println("Digite a data de nascimento do cliente:");
        String dataNascimentoCliente = scanner.nextLine();
        System.out.println("Digite o telefone do cliente:");
        String telefoneCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, enderecoCliente, dataNascimentoCliente, telefoneCliente);

        // Cadastro de livros
        System.out.println("\nCadastro de Livro");
        System.out.println("Digite o nome do livro:");
        String nomeLivro = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autorLivro = scanner.nextLine();
        System.out.println("Digite a quantidade de páginas do livro:");
        int qtdPaginasLivro = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a editora do livro:");
        String editoraLivro = scanner.nextLine();

        Livro livro = new Livro(nomeLivro, autorLivro, qtdPaginasLivro, editoraLivro);

        // Empréstimo de livro
        System.out.println("\nEmpréstimo de Livro");
        System.out.println("Digite a data de empréstimo:");
        String dataEmprestimo = scanner.nextLine();
        System.out.println("Digite a data de devolução:");
        String dataDevolucao = scanner.nextLine();

        EmprestimoDTO emprestimoDTO = new EmprestimoDTO(cliente, livro, dataEmprestimo, dataDevolucao);

        // Exibição dos dados do empréstimo usando DTO
        System.out.println("\nDetalhes do Empréstimo:");
        System.out.println("Nome do Cliente: " + emprestimoDTO.getNomeCliente());
        System.out.println("Nome do Livro: " + emprestimoDTO.getNomeLivro());
        System.out.println("Data de Empréstimo: " + emprestimoDTO.getDataEmprestimo());
        System.out.println("Data de Devolução: " + emprestimoDTO.getDataDevolucao());
    }
}
