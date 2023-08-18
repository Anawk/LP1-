package Agenda;

import java.util.Scanner;

public class Lembrete extends Eventos {
   private String hora;
    Scanner scanner = new Scanner(System.in);

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Lembrete(String nome, String data, String descricao, String hora) {
        super(nome, data, descricao);
        this.hora = hora;
    }

    public void addLembrete() {
        System.out.println("Nome do Lembrete:");
        setNome(scanner.nextLine());

        System.out.println("Data do Lembrete:");
        setData(scanner.nextLine());

        System.out.println("Descrição:");
        setDescricao(scanner.nextLine());

        System.out.println("Horário:");
        setHora(scanner.nextLine());
    }

}
