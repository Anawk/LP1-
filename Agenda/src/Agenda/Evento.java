package Agenda;

import java.util.Date;
import java.util.Scanner;


public class Evento  extends Eventos {


    Scanner scanner = new Scanner(System.in);

    public Evento(String nome, String descricao,Date data, Date hinicio, Date hfinal) {
        super(nome, descricao,data, hinicio, hfinal);
    }

    public Evento() {

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
