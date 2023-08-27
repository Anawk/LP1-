package Agenda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Eventos {
    private String nome;
    private Date data;
    private String descricao;

    private Date Hinicio;
    private Date Hfinal;

    public Eventos(String nome, String descricao, Date data) {

    }

    public Date getHinicio() {
        return Hinicio;
    }

    public void setHinicio(Date hinicio) {
        Hinicio = hinicio;
    }

    public Date getHfinal() {
        return Hfinal;
    }

    public void setHfinal(Date hfinal) {
        Hfinal = hfinal;
    }

    public Eventos(String nome,String descricao, Date data, Date hinicio, Date hfinal) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        Hinicio = hinicio;
        Hfinal = hfinal;
    }

    public Eventos() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    List<Evento> eventos = new ArrayList<>();
    List<Tarefa> tarefas = new ArrayList<>();
    List<Lembrete> lembretes = new ArrayList<>();


    public void addEvento(Evento evento){
        eventos.add(evento);
    }

    public void addLembrete (Lembrete lembrete){
        lembretes.add(lembrete);
    }

    public void addTarefa (Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public List<Evento> getEventosByDate(Date date){
        List<Evento> filteredEvents = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Evento evento : eventos){
            String eventDateStr = dateFormat.format(evento.getData());
            String inputDateStr = dateFormat.format(getData());

            if(eventDateStr.equals(inputDateStr))
            {
               filteredEvents.add(evento) ;
            }
        }
        return filteredEvents;
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

    public void viewTasksByDate(Date data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Tarefas para " + dateFormat.format(data) + ":");

        for (Tarefa tarefa : tarefas) {
            if (isSameDate(tarefa.getData(), data)) {
                System.out.println("Nome: " + tarefa.getNome());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println();
            }
        }
    }

    public static boolean isSameDate(Date date1, Date date2) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date1).equals(dateFormat.format(date2));
    }

    public void viewRemindersByDate(Date data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Lembretes para " + dateFormat.format(data) + ":");

        for (Lembrete lembrete : lembretes) {
            if (isSameDate(lembrete.getData(), data)) {
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
                System.out.println("Nome: " + lembrete.getNome());
                System.out.println("Descrição: " + lembrete.getDescricao());
                System.out.println("Horário: " + timeFormat.format(lembrete.getHora()));
                System.out.println();
            }
        }
    }

    public void viewEventsByDate(Date data) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Eventos para " + dateFormat.format(data) + ":");

        for (Evento evento : eventos) {
            if (isSameDate(evento.getData(), data)) {
                SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
                System.out.println("Nome: " + evento.getNome());
                System.out.println("Descrição: " + evento.getDescricao());
                System.out.println("Horário: " + timeFormat.format(evento.getHinicio()) + " - " + timeFormat.format(evento.getHfinal()));
                System.out.println();
            }
        }
    }





}
