package com.muller.futurodev2.domain.repository;

import com.muller.futurodev2.domain.model.ClienteModel;
import com.muller.futurodev2.domain.model.EnderecoModel;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {

    public void salvarCliente(ClienteModel clienteModel) {
        var insertTable = "insert into cliente (nome, cpf) values ()";
        System.out.println("Cliente inserido com sucesso!" + clienteModel.toString());
    }

    public void salvarEndereco(EnderecoModel enderecoModel) {
        var insertTable = "insert into endereco () values ()";
        System.out.println("Endeço inserido com sucesso!");
    }
}
