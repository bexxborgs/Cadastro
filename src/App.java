import br.com.rborges.dao.ClienteMapDAO;

import br.com.rborges.dao.IClienteDAO;
import br.com.rborges.domain.Cliente;

import javax.swing.*;

/**
 * @author Rebeca
 */
    public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String args[]) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, " + "3 para explusão,4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);


        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção invalida. Digite 1 para cadastro, 2 para consultar, 3 para explusão, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoCadastro(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separaods por virgula conforme, o exemplo: Nome,CPF, Telefone, endereço,numero,cidade e estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separaods por virgula conforme, o exemplo: Nome,CPF, Telefone, endereço,numero,cidade e estado",
                        "Green dinner", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static void excluir(String dados) {
    }

    private static boolean isExclusao(String opcao) {

    }

    private static void consultar(String dados) {
        // validar se foi passado só o cpf
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado" + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(null, "Cliente encontrado" , "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String [] dadosSeparados = dados.split(",");
        // tentar validar se todos os campos estão preenchidos corretamente
        //se não estiver passar null no contrutor onde o valor  é nulo

        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
                JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso","SUCESSO!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Cliente já está cadastrado","erro", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo","Sair",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
        private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }
    private static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }
}
