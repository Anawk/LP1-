import Util.HibernateUtil;
import entity.Cliente;
import entity.OrdemServico;
import entity.Prestador;
import entity.Servico;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.lang.module.Configuration;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        Servico servico1 = new Servico(300.00, "Empresarial");
        Servico servico2 = new Servico(4000.00, "Imobiliario");
        Servico servico3 = new Servico(830.00, "logístico");

        OrdemServico ordemServico1 = new OrdemServico("04/04/2023", "Amazing");

        Cliente cliente1 = new Cliente("Ana Maria", "23578964102");
        Cliente cliente2 = new Cliente("Isadora", "23570064102");
        Cliente cliente3 = new Cliente("Maya", "15578964172");

        Prestador prestador1 = new Prestador("Helio Pereira", "Manutenção preventiva");

        //adicionando o cliente a ordem de serviço
        ordemServico1.setCliente(cliente1);


        //adicionando os serviços na lista
         ordemServico1.adicionarServico(servico1);
        ordemServico1.adicionarServico(servico2);
        ordemServico1.adicionarServico(servico3);

        //adicionando o prestador a ordem servico
        ordemServico1.setPrestador(prestador1);

        //calculando o valor
        //ordemServico1.setValor(ordemServico1.calcularvalortotal());



        //abrindo uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        //persistencia dos dados (salvar no bdd
        session.persist(ordemServico1);

        //fechar a transação
        transaction.commit();

        //exibindo
        //System.out.printf(String.valueOf(ordemServico1));
        ordemServico1.exibirServicos();


    }
}
