package com.muller.futurodev2.domain.service;

import com.muller.futurodev2.domain.repository.UsuarioRepository;
import com.muller.futurodev2.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void salvar(UsuarioDto usuarioDto) {
       // usuarioRepository.salvarCliente();
       // usuarioRepository.salvarEndereco();
    }
}
