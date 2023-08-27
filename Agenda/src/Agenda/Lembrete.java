package Agenda;

import java.util.Date;
import java.util.Scanner;

public class Lembrete extends Eventos {
   private Date hora;
    Scanner scanner = new Scanner(System.in);

    public Lembrete() {

    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Lembrete(String nome, String descricao, Date data,Date hora) {
        super(nome, descricao,data);
        this.hora = hora;
    }
}
