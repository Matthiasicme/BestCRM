package com.example.bestcrmintheunivers.ControllersHw;


import com.example.bestcrmintheunivers.Repositories.EmployRepository;
import com.example.bestcrmintheunivers.entities.Employ;
import com.example.bestcrmintheunivers.entitiesHw.EmployHw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/employHw")
@Controller
public class EmployControllerHw {

    private final EmployRepository employRepository;

    @Autowired
    public EmployControllerHw(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    @GetMapping("/")
    public String list(Model model){
        model.addAttribute("employees", this.employRepository.findAll());
        return "employHw/list";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("employ", new Employ());
        return "employHw/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Employ employ){
        this.employRepository.save(employ);
        return "redirect:/employHw/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        this.employRepository.deleteById(id);
        return "redirect:/employHw/";
    }

}
