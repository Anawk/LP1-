import entity.Endereco;
import entity.Pedido;
import entity.Pessoa;
import entity.Produtos;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", "Maria", "aninhadograu@gmail.com", new Endereco( "ppp", "João Pessoa"), new Produtos("skate", "179,90");

        Pessoa p2 = new Pessoa("Brenda", "Giron", "bbdofutivoli@gmail.com",new Endereco( "ppp", "João Pessoa"));
        Pessoa p3 = new Pessoa("GuMelissa", "Emilia", "guemiliamatadordeonça@gmail.com", new Endereco( "ppp", "João Pessoa"));
        Pessoa p4 = new Pessoa("Gabriel", "Luna", "lunesmaia@gmail.com", new Endereco( "ppp", "João Pessoa"));
        Pessoa p5 = new Pessoa("Isa", "Pantufa", "pantufachocolateira@gmail.com", new Endereco( "ppp", "João Pessoa"));
        Pessoa p6 = new Pessoa("Crestane", "Loira", "cretãoloirão@gmail.com", new Endereco( "jose bonifacio", "Fortaleza"));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(p4);
        session.persist(p5);
        session.persist(p6);

        transaction.commit();

        List<Pessoa> pessoas = session.createQuery("from Pessoa", Pessoa.class).list();


        //iguais
        pessoas.forEach(p -> System.out.println(p.toString()));

        //iguaiss
        //for (Pessoa p: pessoas){
        //System.out.println(p.toString());
        // }



        Endereco e1 = new Endereco("joao augusto", "São Paulo");
        Endereco e2 = new Endereco("cataratas", "Foz do Iguaçu");
        Endereco e3 = new Endereco("paralela", "Salvador");
        Endereco e4 = new Endereco("paulo gustavo", "Rio de janeiro");
        Endereco e5 = new Endereco("oscar freire", "São Paulo");
        Endereco e6 = new Endereco("petronio portela", "Belo Horizonte");

        Session sessioon = HibernateUtil.getSessionFactory().openSession();

        Transaction transactioon = session.beginTransaction();

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        session.persist(e4);
        session.persist(e5);
        session.persist(e6);

        transaction.commit();

        List<Endereco> enderecos = session.createQuery("from enderecos", Endereco.class).list();

         enderecos.forEach(p -> System.out.println(p.toString()));


    }
}


