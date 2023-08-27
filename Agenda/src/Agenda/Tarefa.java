package Agenda;

import java.util.Date;
import java.util.Scanner;

public class Tarefa extends Eventos {


    Scanner scanner = new Scanner(System.in);


    public Tarefa(String nome, String descricao, Date data) {
        super(nome, descricao, data);
    }

    public Tarefa() {

    }
}
