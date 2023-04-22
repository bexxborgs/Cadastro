import br.com.rborges.dao.ClienteMapDAO;

import br.com.rborges.dao.IClienteDAO;
import br.com.rborges.dao.ClienteMapDAO;

import javax.swing.*;

/**
 * @author Rebeca
 */

public class App {
     private static IClienteDAO iClienteDAO;
    public static void main (String args[]){
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,"Digite 1 para cadastro, 2 para consultar, " +
                "3 para explusão,4 para alteração ou 5 para sair","Cadastro", JOptionPane.INFORMATION_MESSAGE);



    }

}
