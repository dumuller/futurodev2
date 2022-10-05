package com.muller.futurodev2.rest.controller;

import com.muller.futurodev2.rest.dto.UsuarioDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String getHelloWorld() {
        return "Hello World";
    }

    @PostMapping("/usuario")
    public String salvarUsuario(@RequestBody UsuarioDto usuarioDto) {
        System.out.println(usuarioDto.toString());
        return "Usuário salvo com sucesso!";
    }
}
