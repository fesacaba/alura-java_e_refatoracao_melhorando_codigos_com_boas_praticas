package br.com.alura;

import br.com.alura.client.ClientHttp;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetCommand implements Command {

    @Override
    public void execute() {
        try {
            ClientHttp http = new ClientHttp();
            PetService petService = new PetService(http);
            petService.importarPetsDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
