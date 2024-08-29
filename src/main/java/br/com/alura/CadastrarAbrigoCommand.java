package br.com.alura;

import br.com.alura.client.ClientHttp;
import br.com.alura.service.AbrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttp http = new ClientHttp();
            AbrigoService abrigoService = new AbrigoService(http);
            abrigoService.cadastrarAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
