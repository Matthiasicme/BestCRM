package com.example.bestcrmintheunivers.Controllers;


import com.example.bestcrmintheunivers.Repositories.ClientRepository;
import com.example.bestcrmintheunivers.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClientController {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("clients", this.clientRepository.findAll());
    return "client/list";
    }

    @GetMapping("/save")
    public String save(){
        Client client = new Client();
        client.setName("Logi");
        client.setAddress("Polska");
        client.setPhone("gorom");
        client.setEmail("to by nic nie dało");
        this.clientRepository.save(client);
        return "redirect:/";
    }

}
