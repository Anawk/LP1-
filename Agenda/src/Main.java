import Agenda.Evento;
import Agenda.Eventos;
import Agenda.Lembrete;
import Agenda.Tarefa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        Eventos evento = new Eventos();
        Evento eventos = new Evento();
        Lembrete lembrete = new Lembrete();
        Tarefa tarefa = new Tarefa();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

          while(true)    {
              System.out.println("BEM VINDO A SUA AGENDA!");
                System.out.println("SELECIONE UMA OPÇÃO DO MENU:");
                System.out.println("1 - Adicionar Evento");
                System.out.println("2 - Adicionar Lembrete");
                System.out.println("3 - Adicionar Tarefa");
                System.out.println("4 - Ver Eventos por data");
                System.out.println("5 - Ver Lembrete por data");
                System.out.println("6 - Ver Tarefa por data");
                System.out.println("7 - Sair");
                System.out.println("Escolha uma opção:");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha){
                    case 1:
                        System.out.println("Nome do evento:");
                             String eventoNome = scanner.nextLine();

                        System.out.println("Descrição do evento:");
                           String eventoDescrição = scanner.nextLine();

                        System.out.println("Data do evento:");
                        Date eventoData = parseDate(scanner.nextLine());

                        System.out.println("Horário de início:");
                         Date eventoInicio = parseTime(scanner.nextLine());

                        System.out.println("Horário final:");
                        Date eventoFinal = parseTime(scanner.nextLine());

                        Evento novoEvento = new Evento(eventoNome, eventoDescrição, eventoData, eventoInicio, eventoFinal);

                        evento.addEvento(novoEvento);
                        System.out.println("Evento adicionado!");

                        break;

                    case 2:
                        System.out.println("Nome do lembrete:");
                        String lembreteNome= scanner.nextLine();

                        System.out.println("Descrição do lembrete:");
                        String lembreteDescrição = scanner.nextLine();

                        System.out.println("Data do lembrete:");
                        Date lembreteData = parseDate(scanner.nextLine());

                        System.out.println("Horário do lembrete:");
                        Date lembreteHora = parseTime(scanner.nextLine());

                        Lembrete novoLembrete = new Lembrete(lembreteNome, lembreteDescrição, lembreteData, lembreteHora);
                        lembrete.addLembrete(novoLembrete);
                        System.out.println("Lembrete adicionado!");

                         break;

                    case 3:
                        System.out.println("Nome da tarefa:");
                        String tarefateNome= scanner.nextLine();

                        System.out.println("Descrição da tarefa:");
                        String tarefaDescrição = scanner.nextLine();

                        System.out.println("Data da tarefa:");
                        Date tarefaData = parseDate(scanner.nextLine());

                        Tarefa novaTarefa = new Tarefa(tarefateNome, tarefaDescrição, tarefaData);
                        tarefa.addTarefa(novaTarefa);
                        System.out.println("Tarefa adicionada!");

                    case 4:
                        System.out.println("Data para visualizar eventos:");
                           Date verData = parseDate(scanner.nextLine());
                           List<Evento> eventosPorData = evento.getEventosByDate(verData);
                           if(eventosPorData.isEmpty()){
                               System.out.println("Nenhum evento encontrado para esta data!");
                           }
                           else {
                               System.out.println("Eventos para " + dateFormat.format(verData) + ":");
                               for (Evento eventoo : eventosPorData){
                                   System.out.println("Nome: " + evento.getNome());
                                   System.out.println("Descrição: " + evento.getDescricao());
                                   System.out.println("Horário: " + timeFormat.format(evento.getHinicio()) + "-" + timeFormat.format(evento.getHfinal()));

                                   System.out.println();
                               }
                           }

                           break;
                    case 5:
                        System.out.print("Data para visualizar tarefas: ");
                        Date taskViewDate = parseDate(scanner.nextLine());
                        evento.viewTasksByDate(taskViewDate);
                        break;

                    case 6:
                        System.out.print("Data para visualizar lembretes (yyyy-MM-dd): ");
                        Date reminderViewDate = parseDate(scanner.nextLine());
                        evento.viewRemindersByDate(reminderViewDate);

                        break;

                    case 7:
                        System.out.println("Saindo do programa!");
                        scanner.close();
                        System.exit(7);

                    default:

                        System.out.println("Opção inváçida. Tente Novamente.");


                }

          }


        }

    public static Date parseDate(String dateString) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;

        }
    }

    public static Date parseTime(String timeString) {
        try {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            return timeFormat.parse(timeString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isSameDate(Date date1, Date date2) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date1).equals(dateFormat.format(date2));
    }

}

