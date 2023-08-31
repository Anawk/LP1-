import com.sun.tools.javac.util.List;
import entity.Passageiro;
import entity.Piloto;
import entity.Viagem;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //criando objetos

        Piloto piloto1 = new Piloto("Evandro", "090901");
        Passageiro passageiro1 = new Passageiro("Anna", "384729472483");
        Passageiro passageiro2 = new Passageiro("Maya", "83926481938");
        Passageiro passageiro3 = new Passageiro("Liz", "2563178564");


        Viagem viagem = new Viagem(4, "Berlim");

        //adicionanado o piloto na viagem, objeto piloto1
        viagem.setPiloto(piloto1);

        //adicionando os passageiros na lista
        viagem.setPassageiros( new ArrayList<>(List.of(passageiro1, passageiro2, passageiro3)));

        //exibir o objeto da viagem com piloto e passageiros
        System.out.println(viagem);

        //abrindo uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();

        //salvando elementos no bdd
        Transaction transaction = session.beginTransaction();

        //persistencia dos dados (salvar no bdd
        session.persist(viagem);

        //fechar a transação
        transaction.commit();

        //buscar a viagem no bdd e exibir no console
        //buscar viagens e guardar numa lista pq ela abrange todas as classes
        //guardar as viagens nima lista
        //no from tem q por o nome da "entity", q e coloquei viagem em minusculo

        List<Viagem> viagens = (List<Viagem>) session.createQuery("from viagem", Viagem.class).list();
        //percorrer
        for (Viagem v : viagens) {
            System.out.println(v);
        }

        //funcionalidade
        //tentar adicionar mais passageiros a viagem, (o permitido é 4 e já tem 3

        Passageiro passageiro4 = new Passageiro("Igor", "384999472483");
        Passageiro passageiro5 = new Passageiro("Felipe", "83926400938");

        //vetor, elemento do vetor, setar um novo elemento
        viagens.get(0).getPassageiros().add(passageiro4);
        viagens.get(0).getPassageiros().add(passageiro5);

        //ver se adicionou mostrando na tela
        System.out.println(viagens.get(0));

        //ele adicionou o 5 passageiro, então precisa tratar na classe viagem, criar um metodo
        //ja criei o metodo agora adiciona o metodo q verifica, ent n precisa usar o get de cima
        viagens.get(0).addPassageiro(passageiro5);

        //se a pessoa entrar dirto com uma lista d 5 passageiro no metodo do começo laa em cima, ele add, então precisa trataar no seet passageiros, la na classe
    }
}
