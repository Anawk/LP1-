package Agenda;

import java.util.Scanner;


public class Evento  extends Eventos {

    private int Hinicio;
    private int Hfinal;
    Scanner scanner = new Scanner(System.in);

    public Evento(String nome, String data, String descricao, int hinicio, int hfinal) {
        super(nome, data, descricao);
        Hinicio = hinicio;
        Hfinal = hfinal;
    }



    public int getHinicio() {
        return Hinicio;
    }

    public void setHinicio(int hinicio) {
        Hinicio = hinicio;
    }

    public int getHfinal() {
        return Hfinal;
    }

    public void setHfinal(int hfinal) {
        Hfinal = hfinal;
    }



    public void addEvento() {
        System.out.println("Nome do evento:");
        setNome(scanner.nextLine());

        System.out.println("Data do evento:");
        setData(scanner.nextLine());

        System.out.println("Descrição:");
        setDescricao(scanner.nextLine());

        System.out.println("Horário de início:");
        setHinicio(scanner.nextInt());

        System.out.println("Horário final");
        setHfinal(scanner.nextInt());
    }

//    public class Conflito{
//        List<Evento> eventos = new ArrayList<>();
//        Conflito(){
//            eventos = new ArrayList<>();
//        }
//
//        boolean addEvento(String nome, String Hinicio, String Hfinal){
//            for (Evento evento : eventos){
//                if ((Hinicio >= evento.getHinicio() && Hinicio < evento.getHfinal()) ||
//                        (Hfinal > evento.getHinicio() && Hfinal<= evento.getHfinal())){
//
//                }
//            }
//        }
//    }





}
