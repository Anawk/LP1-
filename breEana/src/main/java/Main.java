import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", "Maria", "aninhadograu@gmail.com");
        Pessoa p2 = new Pessoa("Brenda", "Giron", "bbdofutivoli@gmail.com");
        Pessoa p3 = new Pessoa("GuMelissa", "Emilia", "guemiliamatadordeonça@gmail.com");
        Pessoa p4 = new Pessoa("Gabriel", "Luna", "lunesmaia@gmail.com");
        Pessoa p5 = new Pessoa("Isa", "Pantufa", "pantufachocolateira@gmail.com");
        Pessoa p6 = new Pessoa("Crestane", "Loira", "cretãoloirão@gmail.com");

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

    }

}



