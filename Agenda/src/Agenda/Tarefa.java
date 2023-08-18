package Agenda;

import java.util.Scanner;

public class Tarefa extends Eventos {


    Scanner scanner = new Scanner(System.in);


    public Tarefa(String nome, String data, String descricao) {
        super(nome, data, descricao);
    }

    public void addTarefa(){
        System.out.println("Nome da Tarefa:");
        setNome(scanner.nextLine());

        System.out.println("Data da Tarefa:");
        setData(scanner.nextLine());

        System.out.println("Descrição:");
        setDescricao(scanner.nextLine());

    }
}
