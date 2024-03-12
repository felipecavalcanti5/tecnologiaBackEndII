package alunoNotas;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<alunoNotas> alunos = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do aluno (ou 'sair' para encerrar):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite a nota 1:");
            int nota1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite a nota 2:");
            int nota2 = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite a nota 3:");
            int nota3 = Integer.parseInt(scanner.nextLine());

            alunoNotas aluno = new alunoNotas(nome, nota1, nota2, nota3);
            alunos.add(aluno);
        }

        double somaMedias = 0;
        int totalAlunos = alunos.size();
        int aprovados = 0;
        int reprovados = 0;

        System.out.println("Notas dos alunos:");
        for (alunoNotas aluno : alunos) {
            System.out.println(aluno.getNome() + ": " + aluno.calcularMedia());
            somaMedias += aluno.calcularMedia();
            if (aluno.isAprovado()) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double mediaGeral = somaMedias / totalAlunos;

        System.out.println("Média geral da turma: " + mediaGeral);
        System.out.println("Quantidade de alunos aprovados: " + aprovados);
        System.out.println("Quantidade de alunos reprovados: " + reprovados);

        System.out.println("Alunos aprovados:");
        for (alunoNotas aluno : alunos) {
            if (aluno.isAprovado()) {
                System.out.println(aluno.getNome());
            }
        }

        System.out.println("Alunos reprovados:");
        for (alunoNotas aluno : alunos) {
            if (!aluno.isAprovado()) {
                System.out.println(aluno.getNome());
            }
        }
    }
}
