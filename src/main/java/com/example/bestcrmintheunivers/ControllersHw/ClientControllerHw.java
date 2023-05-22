package com.example.bestcrmintheunivers.ControllersHw;


import com.example.bestcrmintheunivers.Repositories.ClientRepository;
import com.example.bestcrmintheunivers.entities.Client;
import com.example.bestcrmintheunivers.entitiesHw.ClientHw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/clientHw")
@Controller
public class ClientControllerHw {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientControllerHw(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("clientsHw", this.clientRepository.findAll());
        return "clientHw/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("client", new Client());
        return "clientHw/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Client client){
        this.clientRepository.save(client);
        return "redirect:/clientHw/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.clientRepository.deleteById(id);
        return "redirect:/clientHw/";
    }

}
