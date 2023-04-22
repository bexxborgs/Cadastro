package br.com.rborges.dao;

import br.com.rborges.domain.Cliente;

import java.util.Collection;

/**
 * @author Rebeca
 */
public interface IClienteDAO {
        public Boolean cadastrar(Cliente cliente);

        public void excluir (Long cpf);

        public void alterar (Cliente cliente);

        public Cliente consultar (Long cpf);

        public Collection<Cliente> buscarTodos();
}
