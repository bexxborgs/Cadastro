# Gerenciador de Clientes 

 O Gerenciador de oferece funcionalidades para cadastrar, consultar, atualizar e excluir informações de clientes. 
 A aplicação utiliza a classe Scanner e caixas de diálogo do JOptionPane para interagir com o usuário.

O projeto conta com uma implementação do IClienteDAO, utilizando a classe ClienteMapDAO, para persistir e recuperar os dados dos clientes. 
Ele permite ao usuário cadastrar um cliente informando dados como nome, CPF, telefone, endereço, número, cidade e estado. Os dados são validados antes do cadastro para garantir que todos os campos estejam preenchidos corretamente.

Além disso, o ClienteManager permite consultar um cliente pelo CPF, excluir um cliente com base no CPF informado e atualizar os dados de um cliente já cadastrado. A aplicação exibe mensagens de sucesso ou erro de acordo com o resultado das operações.
