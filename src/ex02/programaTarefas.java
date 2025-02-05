package ex02;

import java.util.Scanner;

public class programaTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um nome para sua tarefa:");
        String titulo = sc.nextLine();

        System.out.println("Qual é a tarefa a ser feita?");
        String descricao = sc.nextLine();

        Tarefas tarefa0 = new Tarefas(titulo, descricao);

        System.out.println("\nAntes de concluir:");
        tarefa0.exibirInformacoes();

        tarefa0.concluirTarefa();

        System.out.println("\nDepois de concluir:");
        tarefa0.exibirInformacoes();

        sc.close();
    }
}

