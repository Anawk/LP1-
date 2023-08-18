import Agenda.Evento;
import Agenda.Lembrete;
import Agenda.Tarefa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Evento> eventos = new ArrayList<>();

        Evento evento = new Evento("", "", "",0,0 );
        Lembrete lembrete = new Lembrete("","","","");
        Tarefa tarefa = new Tarefa("", "", "");

        eventos.add(new Evento("anivrsário da ana", "04/09", "sla", 10, 12));
        eventos.add(new Evento("anivrsário da bre", "04/09", "sla", 10, 12));

        boolean conflito = false;

        for (int i = 0; i < eventos.size(); i++) {
            for (int j = i + 1; j < eventos.size(); j++) {
                Evento evento1 = eventos.get(i);
                Evento evento2 = eventos.get(j);

                if (evento1.getHinicio() >= evento2.getHinicio() && evento1.getHinicio() < evento2.getHfinal() ||
                        evento1.getHfinal() > evento2.getHinicio() && evento1.getHfinal() <= evento2.getHfinal()) {
                    conflito = true;
                    System.out.println("Existe um conflito de horários entre " + evento1.getNome() + " e " + evento2.getNome());

                }
            }
        }
        if (!conflito) {
            System.out.println("Não tem conflitos de horário entre os eventos");
        }


        while (true) {
                System.out.println("BEM VINDO A SUA AGENDA!");
                System.out.println("SELECIONE UMA OPÇÃO DO MENU:");
                System.out.println("1 - Adicionar Evento");
                System.out.println("2 - Adicionar Lembrete");
                System.out.println("3 - Adicionar Tarefa");
                System.out.println("4 - Ver Eventos");
                System.out.println("5 - Ver Lembretes");
                System.out.println("6 - Ver Tarefas");
                System.out.println("7 - Sair do Menu");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1: evento.addEvento();
                    break;

                    case 2: lembrete.addLembrete();
                    break;

                    case 3: tarefa.addTarefa();

//                    case 4:
//                        System.out.println("Eventos:");
//                        for (Evento : eventos){
//                            System.out.println("Nome:" + evento.getNome() + ", Data: " + evento.getData());
//                        }
//                  break;
                    case 4:
                        System.out.println("Saindo do menu");
                        return;

                    default:
                        System.out.println("Selecione novamente");
                        break;

                }
            }



        }
    }

